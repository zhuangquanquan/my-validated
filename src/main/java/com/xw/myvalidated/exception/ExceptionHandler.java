package com.xw.myvalidated.exception;

import com.alibaba.fastjson.JSONObject;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 处理自定义异常
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    public JSONObject handleRRException(BusinessException e) {
        logger.error("自定义异常...");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", e.getMessage());
        return responseBuilder;
    }

    /**
     * 方法参数校验
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public JSONObject handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("参数未验证...");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", e.getBindingResult().getFieldError().getDefaultMessage());
        return responseBuilder;
    }


    /**
     * ValidationException
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(ValidationException.class)
    public JSONObject handleValidationException(ValidationException e) {
        logger.error("约束冲突异常");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", e.getMessage());
        return responseBuilder;
    }

    /**
     * ConstraintViolationException
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public JSONObject handleConstraintViolationException(ConstraintViolationException e) {
        logger.error("约束冲突异常");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", e.getMessage());
        return responseBuilder;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(NoHandlerFoundException.class)
    public JSONObject handlerNoFoundException(Exception e) {
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", "路径不存在，请检查路径是否正确");
        return responseBuilder;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(DuplicateKeyException.class)
    public JSONObject handleDuplicateKeyException(DuplicateKeyException e) {
        logger.error("DuplicateKeyException...");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", "数据重复，请检查后提交");
        return responseBuilder;
    }


    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public JSONObject handleException(Exception e) {
        logger.error("handleException...");
        logger.error(e.getMessage(), e);
        JSONObject responseBuilder = new JSONObject();
        responseBuilder.put("success", false);
        responseBuilder.put("errMsg", "系统繁忙,请稍后再试");
        return responseBuilder;
    }



}
