package com.test.base.ui.fragment

import androidx.fragment.app.viewModels
import com.example.presentation.viewmodels.CoinViewModel
import com.test.base.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, CoinViewModel>(FragmentMainBinding::inflate){

    override val viewModel: CoinViewModel by viewModels()

    override fun setupView() {
        bind {
        }
    }
}