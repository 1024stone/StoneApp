package com.example.stonelibrary.log;

import org.jetbrains.annotations.NotNull;

/**
 * Log管理类
 * 需要持有logconfig  还需要实现他的单例
 * */
public class StoneLogManager {
    private StoneLogConfig config;
    private static StoneLogManager instance;
    private StoneLogManager(StoneLogConfig config){
        this.config = config;
    }
    public static StoneLogManager getInstance(){
        return instance;
    }
    public static void init(@NotNull StoneLogConfig config){
        instance = new StoneLogManager(config);
    }

    public StoneLogConfig getConfig(){
        return config;
    }
}
