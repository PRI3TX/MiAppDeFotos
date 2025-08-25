package com.miappdefotos

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import java.util.Collections

class MainApplication : Application(), ReactApplication {

    override val reactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG
        
        override fun getPackages(): List<ReactPackage> = Collections.emptyList()
        
        override fun getJSMainModuleName(): String = "index"
    }
}