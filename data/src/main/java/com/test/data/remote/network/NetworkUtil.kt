package com.test.data.remote.network

import com.example.common.utils.logMessage
import com.test.domain.ApiResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

//suspend fun <T> safeApiResult(apiFunc: suspend () -> Response<T>) = try {
//    val response = apiFunc()
//    if (response.isSuccessful) {
//        response.body()?.let {
//            ApiResult.Success(it)
//        } ?: ApiResult.Empty
//    } else {
//        ApiResult.Error(code = response.code(), exception = HttpException(response))
//    }
//} catch (e: IOException) {
//    ApiResult.Error(exception = e)
//} catch (e: Exception) {
//    ApiResult.Error(exception = e)
//}



fun <T> safeFlow(apiFunc: suspend () -> Response<T>): Flow<ApiResult<T>> = flow{
    emit(ApiResult.Loading)
    try {
        val response = apiFunc()
        if (response.isSuccessful) {
            response.body()?.let {
                emit(ApiResult.Success(it))
            } ?: emit(ApiResult.Empty)
        } else {
            logMessage("API Error: ${response.code()} - ${response.message()}")
            emit(ApiResult.Error(code = response.code(), exception = HttpException(response)))
        }
    } catch (e: IOException) {
        logMessage("Network Error : $e")
        emit(ApiResult.Error(exception = e))
    } catch (e: Exception) {
        logMessage("Unexpected Error : $e")
        emit(ApiResult.Error(exception = e))
    }
}