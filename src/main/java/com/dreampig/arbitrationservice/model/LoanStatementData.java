package com.dreampig.arbitrationservice.model;

import java.math.BigDecimal;
import java.util.Date;

public class LoanStatementData {
    private Long id;

    private String accountStatementCode;

    private String accountStatementReturn;

    private String lenderAccountNo;

    private String lenderBank;

    private String receiveAccountNo;

    private BigDecimal statementAmount;

    private Date tradeDate;

    private String businessCode01;

    private String businessCode02;

    private String businessCode03;

    private Date importTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountStatementCode() {
        return accountStatementCode;
    }

    public void setAccountStatementCode(String accountStatementCode) {
        this.accountStatementCode = accountStatementCode == null ? null : accountStatementCode.trim();
    }

    public String getAccountStatementReturn() {
        return accountStatementReturn;
    }

    public void setAccountStatementReturn(String accountStatementReturn) {
        this.accountStatementReturn = accountStatementReturn == null ? null : accountStatementReturn.trim();
    }

    public String getLenderAccountNo() {
        return lenderAccountNo;
    }

    public void setLenderAccountNo(String lenderAccountNo) {
        this.lenderAccountNo = lenderAccountNo == null ? null : lenderAccountNo.trim();
    }

    public String getLenderBank() {
        return lenderBank;
    }

    public void setLenderBank(String lenderBank) {
        this.lenderBank = lenderBank == null ? null : lenderBank.trim();
    }

    public String getReceiveAccountNo() {
        return receiveAccountNo;
    }

    public void setReceiveAccountNo(String receiveAccountNo) {
        this.receiveAccountNo = receiveAccountNo == null ? null : receiveAccountNo.trim();
    }

    public BigDecimal getStatementAmount() {
        return statementAmount;
    }

    public void setStatementAmount(BigDecimal statementAmount) {
        this.statementAmount = statementAmount;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getBusinessCode01() {
        return businessCode01;
    }

    public void setBusinessCode01(String businessCode01) {
        this.businessCode01 = businessCode01 == null ? null : businessCode01.trim();
    }

    public String getBusinessCode02() {
        return businessCode02;
    }

    public void setBusinessCode02(String businessCode02) {
        this.businessCode02 = businessCode02 == null ? null : businessCode02.trim();
    }

    public String getBusinessCode03() {
        return businessCode03;
    }

    public void setBusinessCode03(String businessCode03) {
        this.businessCode03 = businessCode03 == null ? null : businessCode03.trim();
    }

    public Date getImportTime() {
        return importTime;
    }

    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }
}