package com.dreampig.arbitrationservice.model;

import java.util.Date;

public class ArbitrationToken {
    private Integer id;

    private Integer authId;

    private String authToken;

    private Date authTokenExpirTime;

    private Date cratetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken == null ? null : authToken.trim();
    }

    public Date getAuthTokenExpirTime() {
        return authTokenExpirTime;
    }

    public void setAuthTokenExpirTime(Date authTokenExpirTime) {
        this.authTokenExpirTime = authTokenExpirTime;
    }

    public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }
}