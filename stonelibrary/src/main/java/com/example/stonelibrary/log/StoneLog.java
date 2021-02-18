package com.example.stonelibrary.log;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

/**
 * tips
 * 1.打印堆栈信息
 * 2.File输出
 * 3.模拟控制台
 */
public class StoneLog {
    public static void v(Object... contents) {
        log(StoneLogType.V, contents);
    }

    public static void vt(String tag, Object... contents) {
        log(StoneLogType.V, tag, contents);
    }

    public static void d(Object... contents) {
        log(StoneLogType.D, contents);
    }

    public static void dt(String tag, Object... contents) {
        log(StoneLogType.D, tag, contents);
    }

    public static void i(Object... contents) {
        log(StoneLogType.I, contents);
    }

    public static void it(String tag, Object... contents) {
        log(StoneLogType.I, tag, contents);
    }

    public static void e(Object... contents) {
        log(StoneLogType.E, contents);
    }

    public static void et(String tag, Object... contents) {
        log(StoneLogType.E, tag, contents);
    }

    public static void a(Object... contents) {
        log(StoneLogType.A, contents);
    }

    public static void at(String tag, Object... contents) {
        log(StoneLogType.A, tag, contents);
    }

    public static void w(Object... contents) {
        log(StoneLogType.W, contents);
    }

    public static void wt(String tag, Object... contents) {
        log(StoneLogType.W, tag, contents);
    }

    public static void log(@StoneLogType.TYPE int type, Object... contents) {
        log(type,StoneLogManager.getInstance().getConfig().getGlobalTag(),contents);
    }

    public static void log(@StoneLogType.TYPE int type, @NotNull String tag, Object... contents) {
        log(StoneLogManager.getInstance().getConfig(),type,tag,contents);

    }
    public static void log(@NotNull StoneLogConfig config,@StoneLogType.TYPE int type, @NotNull String tag, Object... contents) {
        if (!config.enable()){
            return;
        }
        StringBuilder sb = new StringBuilder();
        String body = parseBody(contents);
        sb.append(body);
        Log.println(type,tag,body);
    }

    /**
     * 将Object类型数组，解析成String
     * */
    private static String parseBody(@NotNull Object[] contents){
        StringBuilder sb = new StringBuilder();
        for (Object o:contents){
            //遍历
            sb.append(o.toString()).append(";");
        }
        if (sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

}
