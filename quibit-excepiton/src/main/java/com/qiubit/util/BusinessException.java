package com.qiubit.util;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1273507229781519318L;

	// 自定义错误码
	private Integer code;

	// 自定义构造器，只保留一个，让其必须输入错误码及内容
	public BusinessException() {
	}

	public BusinessException(ExceptionResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
