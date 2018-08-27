package com.qiubit.util;

import java.io.Serializable;

public class Result<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3362196283188715707L;
	private Integer code;
	private String msg;
	private T Data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	@Override
	public String toString() {
		return "Result{" + "code=" + code + ", msg='" + msg + '\'' + ", Data=" + Data + '}';
	}

}
