package com.xw.myvalidated.exception;

/**
 * 路径不存在，请检查路径是否正确
 */
public class NoHandlerFoundException extends Exception{

    // 参构造函数
    public NoHandlerFoundException(){
        super();
    }

    // 用详细信息指定一个异常
    public NoHandlerFoundException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public NoHandlerFoundException(String message, Throwable cause){
        super(message,cause);
    }

    // 用指定原因构造一个新的异常
    public NoHandlerFoundException(Throwable cause) {
        super(cause);
    }

}
