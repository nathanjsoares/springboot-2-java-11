package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
	private Instant timeStamp;
	private Integer status;
	private String error;
	private String mensage;
	private String patch;
	
	public StandardError() {
	}

	public StandardError(Instant timeStamp, Integer status, String error, String mensage, String patch) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.mensage = mensage;
		this.patch = patch;
	}

	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public String getPatch() {
		return patch;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}
}
