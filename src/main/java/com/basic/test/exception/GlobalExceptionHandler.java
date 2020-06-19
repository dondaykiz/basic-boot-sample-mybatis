package com.basic.test.exception;

import com.basic.test.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * 전역적으로 예외를 처리하기 위한 핸들러.
 *
 * @author yjkim@ntels.com
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 기본 생성자.
     */
    public GlobalExceptionHandler() {
    }

    /**
     * InvalidRequestException 처리.
     *
     * @param req HttpServletRequest 객체
     * @param e   Exception 객체
     * @return ApiResponse
     */
    @ExceptionHandler(InvalidRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ApiResponse handleInvalidRequestException(HttpServletRequest req, InvalidRequestException e) {
        logger.warn("INVALID_REQUEST_EXCEPTION >> {} > {}", req.getRequestURI(), e.getMessage());
        return new ApiResponse(e.getErrorCode(), e.getErrorMessage());
    }


}
