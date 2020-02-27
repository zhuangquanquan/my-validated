package com.xw.myvalidated.exception;

/**
 * 业务异常
 */
public class BusinessException extends Exception{

    // 参构造函数
    public BusinessException(){
        super();
    }

    // 用详细信息指定一个异常
    public BusinessException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public BusinessException(String message, Throwable cause){
        super(message,cause);
    }

    // 用指定原因构造一个新的异常
    public BusinessException(Throwable cause) {
        super(cause);
    }

}
