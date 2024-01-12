package com.example.demo.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

    private Long TimeStamp;
    private Integer status;
    private String mensage;

    public StandardError(Long timeStamp, Integer status, String mensage) {
        TimeStamp = timeStamp;
        this.status = status;
        this.mensage = mensage;
    }
    public StandardError(){

    }

    public Long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        TimeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }
}
