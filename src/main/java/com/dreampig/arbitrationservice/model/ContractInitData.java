package com.dreampig.arbitrationservice.model;

import java.util.Date;

public class ContractInitData {
    private Integer id;

    private String type;

    private String sign;

    private String filebodymd5;

    private String filebodyhash;

    private Integer notarialcertificateapplicatsumjson;

    private Integer lenderinfos;

    private Date updatetime;

    private Date createtime;

    private byte[] filebody;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getFilebodymd5() {
        return filebodymd5;
    }

    public void setFilebodymd5(String filebodymd5) {
        this.filebodymd5 = filebodymd5 == null ? null : filebodymd5.trim();
    }

    public String getFilebodyhash() {
        return filebodyhash;
    }

    public void setFilebodyhash(String filebodyhash) {
        this.filebodyhash = filebodyhash == null ? null : filebodyhash.trim();
    }

    public Integer getNotarialcertificateapplicatsumjson() {
        return notarialcertificateapplicatsumjson;
    }

    public void setNotarialcertificateapplicatsumjson(Integer notarialcertificateapplicatsumjson) {
        this.notarialcertificateapplicatsumjson = notarialcertificateapplicatsumjson;
    }

    public Integer getLenderinfos() {
        return lenderinfos;
    }

    public void setLenderinfos(Integer lenderinfos) {
        this.lenderinfos = lenderinfos;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public byte[] getFilebody() {
        return filebody;
    }

    public void setFilebody(byte[] filebody) {
        this.filebody = filebody;
    }
}