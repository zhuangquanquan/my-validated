package com.xw.myvalidated.exception;

public class ValidationException extends Exception{

    // 参构造函数
    public ValidationException(){
        super();
    }

    // 用详细信息指定一个异常
    public ValidationException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public ValidationException(String message, Throwable cause){
        super(message,cause);
    }

    // 用指定原因构造一个新的异常
    public ValidationException(Throwable cause) {
        super(cause);
    }

}
