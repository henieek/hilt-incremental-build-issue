package com.example.hiltissue

import android.app.Application
import com.example.feature.MyService
import dagger.Lazy
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : Application() {

    @Inject
    lateinit var service: Lazy<MyService>
}