package com.test.base.viewmodel

import androidx.lifecycle.ViewModel
import com.test.base.network.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinViewmodel @Inject constructor(private val coinRepository: CoinRepository) : ViewModel() {
}