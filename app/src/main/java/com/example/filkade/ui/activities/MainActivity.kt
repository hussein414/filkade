package com.example.filkade.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.filkade.R
import com.example.filkade.databinding.ActivityMainBinding
import com.example.filkade.ui.adapter.TvShowsAdapter
import com.example.filkade.ui.viewmodel.TvShowsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: TvShowsViewModel by viewModels()
    private lateinit var tvShowAdapter: TvShowsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        tvShowAdapter = TvShowsAdapter()

        binding.recyclerView.apply {
            adapter = tvShowAdapter
            layoutManager = GridLayoutManager(
                this@MainActivity, 2, GridLayoutManager.VERTICAL,
                false
            )

            setHasFixedSize(true)
        }

        viewModel.responseTvShows.observe(this) { listTvShows ->
            tvShowAdapter.tvShows = listTvShows

        }




    }
}