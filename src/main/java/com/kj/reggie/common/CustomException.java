package com.kj.reggie.common;

/**
 * @author kj
 * @date 2022/11/3
 * @apiNote 自定义业务异常类
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
