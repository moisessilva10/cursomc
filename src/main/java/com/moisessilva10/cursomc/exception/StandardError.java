package com.moisessilva10.cursomc.exception;

import java.io.Serializable;

import lombok.Data;


@Data
public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timesTamp;
	
	
	public StandardError(Integer status, String msg, Long timesTamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timesTamp = timesTamp;
	}
	
	
	
	
}
