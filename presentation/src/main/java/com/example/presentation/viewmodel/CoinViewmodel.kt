package com.example.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.presentation.model.CoinModel
import com.example.presentation.modelmapper.CoinMapper
import com.test.domain.usecase.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinViewmodel @Inject constructor(private val getCoinUseCase: GetCoinUseCase) : ViewModel() {
    private val _coinLiveData: MutableLiveData<CoinModel> = MutableLiveData()
    val coinLiveData: LiveData<CoinModel> get() = _coinLiveData

    fun fetchCoin(){
        viewModelScope.launch {
            _coinLiveData.value = CoinMapper.toCoinModel(getCoinUseCase())
        }
    }
}