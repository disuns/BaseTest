package com.example.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.presentation.models.CoinUiModel
import com.example.presentation.mappers.CoinPresentationMapper
import com.test.domain.usecase.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinViewModel @Inject constructor(private val getCoinUseCase: GetCoinUseCase) : ViewModel() {
    private val _coinLiveData: MutableLiveData<CoinUiModel> = MutableLiveData()
    val coinLiveData: LiveData<CoinUiModel> get() = _coinLiveData

    fun fetchCoin(){
        viewModelScope.launch {
            _coinLiveData.value = CoinPresentationMapper.toCoinModel(getCoinUseCase())
        }
    }
}