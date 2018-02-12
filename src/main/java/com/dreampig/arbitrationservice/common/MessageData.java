package com.dreampig.arbitrationservice.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class MessageData implements Serializable {
    /**状态码**/
    private String retCode;
    /**返回消息**/
    private String retMsg;
    /**第三方系统编号**/
    private String sid;
    /**令牌**/
    private String token;
    /**令牌失效时间**/
    private String deadTime;
    /**合同保全编号**/
    private String SaveCode;
    /**仲裁申请编号**/
    private String IceCode;
    /**申请书文件字节数组Base64后的字符串**/
    private String fileBody;
    /**申请书文件md5值**/
    private String fileBodyMd5;

    /**状态码**/
    public String getRetCode() {
        return retCode;
    }
    /**状态码**/
    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
    /**返回消息**/
    public String getRetMsg() {
        return retMsg;
    }
    /**返回消息**/
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
    /**第三方系统编号**/
    public String getSid() {
        return sid;
    }
    /**第三方系统编号**/
    public void setSid(String sid) {
        this.sid = sid;
    }
    /**令牌**/
    public String getToken() {
        return token;
    }
    /**令牌**/
    public void setToken(String token) {
        this.token = token;
    }
    /**令牌失效时间**/
    public String getDeadTime() {
        return deadTime;
    }
    /**令牌失效时间**/
    public void setDeadTime(String deadTime) {
        this.deadTime = deadTime;
    }
    /**合同保全编号**/
    public String getSaveCode() {
        return SaveCode;
    }
    /**合同保全编号**/
    public void setSaveCode(String saveCode) {
        SaveCode = saveCode;
    }
    /**仲裁申请编号**/
    public String getIceCode() {
        return IceCode;
    }
    /**仲裁申请编号**/
    public void setIceCode(String iceCode) {
        IceCode = iceCode;
    }
    /**申请书文件字节数组Base64后的字符串**/
    public String getFileBody() {
        return fileBody;
    }
    /**申请书文件字节数组Base64后的字符串**/
    public void setFileBody(String fileBody) {
        this.fileBody = fileBody;
    }
    /**申请书文件md5值**/
    public String getFileBodyMd5() {
        return fileBodyMd5;
    }
    /**申请书文件md5值**/
    public void setFileBodyMd5(String fileBodyMd5) {
        this.fileBodyMd5 = fileBodyMd5;
    }
}
