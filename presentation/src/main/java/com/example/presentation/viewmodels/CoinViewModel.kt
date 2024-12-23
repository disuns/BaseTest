package com.example.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.presentation.models.CoinUiModel
import com.example.presentation.mappers.CoinPresentationMapper
import com.test.domain.ApiResult
import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinViewModel @Inject constructor(private val getCoinUseCase: GetCoinUseCase) : ViewModel() {
    private val _coinLiveData: MutableLiveData<ApiResult<CoinUiModel>> = MutableLiveData()
    val coinLiveData: LiveData<ApiResult<CoinUiModel>> get() = _coinLiveData

    fun fetchCoin(){
        viewModelScope.launch {
            CoinPresentationMapper.domainToUI(getCoinUseCase())
//            _coinLiveData.value = CoinPresentationMapper.domainToUI(getCoinUseCase())
        }
    }
}