package com.kj.reggie.common;

/**
 * @author kj
 * @date 2022/11/3
 * @apiNote 配置线程中存取值的方法类
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=
            new ThreadLocal<>();

    /**
     * 设置值,在该线程中储存值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 取出值,在该线程中取出值
     *
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
