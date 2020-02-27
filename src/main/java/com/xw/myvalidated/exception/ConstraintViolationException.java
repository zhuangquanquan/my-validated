package com.xw.myvalidated.exception;

/**
 * 约束冲突异常
 */
public class ConstraintViolationException extends Exception{

    // 参构造函数
    public ConstraintViolationException(){
        super();
    }

    // 用详细信息指定一个异常
    public ConstraintViolationException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public ConstraintViolationException(String message, Throwable cause){
        super(message,cause);
    }

    // 用指定原因构造一个新的异常
    public ConstraintViolationException(Throwable cause) {
        super(cause);
    }

}
