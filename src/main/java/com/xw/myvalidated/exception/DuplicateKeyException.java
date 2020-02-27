package com.xw.myvalidated.exception;

/**
 * 数据重复，请检查后提交
 */
public class DuplicateKeyException extends Exception{

    // 参构造函数
    public DuplicateKeyException(){
        super();
    }

    // 用详细信息指定一个异常
    public DuplicateKeyException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public DuplicateKeyException(String message, Throwable cause){
        super(message,cause);
    }

    // 用指定原因构造一个新的异常
    public DuplicateKeyException(Throwable cause) {
        super(cause);
    }

}
