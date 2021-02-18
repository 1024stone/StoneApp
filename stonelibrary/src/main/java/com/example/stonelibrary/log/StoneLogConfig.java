package com.example.stonelibrary.log;

/**
 * Log配置类
 * */
public abstract class StoneLogConfig {
    public String getGlobalTag(){
        return "StoneLog";
    }
    public boolean enable(){
        return true;
    }

}
