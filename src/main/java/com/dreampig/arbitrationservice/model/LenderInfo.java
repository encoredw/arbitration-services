package com.dreampig.arbitrationservice.model;

import java.util.Date;

public class LenderInfo {
    private Integer id;

    private String lendertype;

    private String lendername;

    private String lendergender;

    private Date lenderbirthday;

    private String lendercardtype;

    private String lendercardno;

    private String lendermobile;

    private String lenderbankemail;

    private String lenderorganizationname;

    private String lenderorganizationcode;

    private String lenderorganizationadd;

    private String lenderorganizationcontact;

    private String lenderorganizationemail;

    private String lenderlegalname;

    private String lenderlegalcardtype;

    private String lenderlegalcardno;

    private String lenderbank;

    private String lenderbankcardno;

    private Date updatetime;

    private Date cratetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLendertype() {
        return lendertype;
    }

    public void setLendertype(String lendertype) {
        this.lendertype = lendertype == null ? null : lendertype.trim();
    }

    public String getLendername() {
        return lendername;
    }

    public void setLendername(String lendername) {
        this.lendername = lendername == null ? null : lendername.trim();
    }

    public String getLendergender() {
        return lendergender;
    }

    public void setLendergender(String lendergender) {
        this.lendergender = lendergender == null ? null : lendergender.trim();
    }

    public Date getLenderbirthday() {
        return lenderbirthday;
    }

    public void setLenderbirthday(Date lenderbirthday) {
        this.lenderbirthday = lenderbirthday;
    }

    public String getLendercardtype() {
        return lendercardtype;
    }

    public void setLendercardtype(String lendercardtype) {
        this.lendercardtype = lendercardtype == null ? null : lendercardtype.trim();
    }

    public String getLendercardno() {
        return lendercardno;
    }

    public void setLendercardno(String lendercardno) {
        this.lendercardno = lendercardno == null ? null : lendercardno.trim();
    }

    public String getLendermobile() {
        return lendermobile;
    }

    public void setLendermobile(String lendermobile) {
        this.lendermobile = lendermobile == null ? null : lendermobile.trim();
    }

    public String getLenderbankemail() {
        return lenderbankemail;
    }

    public void setLenderbankemail(String lenderbankemail) {
        this.lenderbankemail = lenderbankemail == null ? null : lenderbankemail.trim();
    }

    public String getLenderorganizationname() {
        return lenderorganizationname;
    }

    public void setLenderorganizationname(String lenderorganizationname) {
        this.lenderorganizationname = lenderorganizationname == null ? null : lenderorganizationname.trim();
    }

    public String getLenderorganizationcode() {
        return lenderorganizationcode;
    }

    public void setLenderorganizationcode(String lenderorganizationcode) {
        this.lenderorganizationcode = lenderorganizationcode == null ? null : lenderorganizationcode.trim();
    }

    public String getLenderorganizationadd() {
        return lenderorganizationadd;
    }

    public void setLenderorganizationadd(String lenderorganizationadd) {
        this.lenderorganizationadd = lenderorganizationadd == null ? null : lenderorganizationadd.trim();
    }

    public String getLenderorganizationcontact() {
        return lenderorganizationcontact;
    }

    public void setLenderorganizationcontact(String lenderorganizationcontact) {
        this.lenderorganizationcontact = lenderorganizationcontact == null ? null : lenderorganizationcontact.trim();
    }

    public String getLenderorganizationemail() {
        return lenderorganizationemail;
    }

    public void setLenderorganizationemail(String lenderorganizationemail) {
        this.lenderorganizationemail = lenderorganizationemail == null ? null : lenderorganizationemail.trim();
    }

    public String getLenderlegalname() {
        return lenderlegalname;
    }

    public void setLenderlegalname(String lenderlegalname) {
        this.lenderlegalname = lenderlegalname == null ? null : lenderlegalname.trim();
    }

    public String getLenderlegalcardtype() {
        return lenderlegalcardtype;
    }

    public void setLenderlegalcardtype(String lenderlegalcardtype) {
        this.lenderlegalcardtype = lenderlegalcardtype == null ? null : lenderlegalcardtype.trim();
    }

    public String getLenderlegalcardno() {
        return lenderlegalcardno;
    }

    public void setLenderlegalcardno(String lenderlegalcardno) {
        this.lenderlegalcardno = lenderlegalcardno == null ? null : lenderlegalcardno.trim();
    }

    public String getLenderbank() {
        return lenderbank;
    }

    public void setLenderbank(String lenderbank) {
        this.lenderbank = lenderbank == null ? null : lenderbank.trim();
    }

    public String getLenderbankcardno() {
        return lenderbankcardno;
    }

    public void setLenderbankcardno(String lenderbankcardno) {
        this.lenderbankcardno = lenderbankcardno == null ? null : lenderbankcardno.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }
}