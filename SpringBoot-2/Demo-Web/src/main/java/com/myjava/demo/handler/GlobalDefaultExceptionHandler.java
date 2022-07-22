package com.myjava.demo.handler;

import com.myjava.demo.response.base.ApiResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 通用异常捕获
 */
@ControllerAdvice
@ResponseBody
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ApiResponse result = new ApiResponse();
        result.setCode(500);
        result.setMsg(e.getBindingResult().getFieldError().getDefaultMessage());
        result.setData(null);
        return result;
    }

    @ExceptionHandler(Exception.class)
    public ApiResponse defaultErrorHandler(HttpServletRequest req, Exception e) {
        ApiResponse result = new ApiResponse();
        // 这里需要注意一下，因为这个方法会拦截所有异常，包括设置了@ResponseStatus注解的异常，如果你不想拦截这些异常，可以过滤一下，然后重新抛出
//        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
//            throw e;
        result.setCode(500);
        result.setMsg(e.getMessage());
        result.setData(null);
        return result;
    }
}
