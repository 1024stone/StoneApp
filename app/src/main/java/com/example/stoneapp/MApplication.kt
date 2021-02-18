package com.example.stoneapp

import android.app.Application
import com.example.stonelibrary.log.StoneLogConfig
import com.example.stonelibrary.log.StoneLogManager

class MApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        StoneLogManager.init(object :StoneLogConfig(){
            override fun getGlobalTag(): String {
                return "MApplication"
            }

            override fun enable(): Boolean {
                return true;
            }
        })
    }
}