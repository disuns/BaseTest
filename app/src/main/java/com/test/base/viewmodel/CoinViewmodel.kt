package com.test.base.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.domain.usecase.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinViewmodel @Inject constructor(private val getCoinUseCase: GetCoinUseCase) : ViewModel() {

    fun fetchCoin(){
        viewModelScope.launch {
            getCoinUseCase()
        }
    }
}