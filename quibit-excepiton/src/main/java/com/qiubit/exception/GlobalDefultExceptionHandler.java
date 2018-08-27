package com.qiubit.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiubit.util.BusinessException;
import com.qiubit.util.Result;
import com.qiubit.util.ResultUtil;

@ControllerAdvice
public class GlobalDefultExceptionHandler {
	private final Logger logger = LoggerFactory.getLogger(GlobalDefultExceptionHandler.class);

	/** 全局异常捕捉处理 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public <T> Result<?> defultExcepitonHandler(HttpServletRequest request, Exception e) {
		e.printStackTrace();
		if (e instanceof BusinessException) {
			logger.error("业务异常：" + e.getMessage());
			BusinessException businessException = (BusinessException) e;
			return ResultUtil.error(businessException.getCode(), businessException.getMessage());
		}
		// 未知错误
		return ResultUtil.error(-1, "系统异常：\\n" + e);
	}

}
