package com.dreampig.arbitrationservice.model;

import java.math.BigDecimal;
import java.util.Date;

public class RepaymentStatementData {
    private Long id;

    private String accountStatementCode;

    private String repaymentSerialNumber;

    private String repayAccountNo;

    private String repaymentBank;

    private String receiveAccountNo;

    private BigDecimal repaymentAmount;

    private Date repaymentTime;

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

    public String getRepaymentSerialNumber() {
        return repaymentSerialNumber;
    }

    public void setRepaymentSerialNumber(String repaymentSerialNumber) {
        this.repaymentSerialNumber = repaymentSerialNumber == null ? null : repaymentSerialNumber.trim();
    }

    public String getRepayAccountNo() {
        return repayAccountNo;
    }

    public void setRepayAccountNo(String repayAccountNo) {
        this.repayAccountNo = repayAccountNo == null ? null : repayAccountNo.trim();
    }

    public String getRepaymentBank() {
        return repaymentBank;
    }

    public void setRepaymentBank(String repaymentBank) {
        this.repaymentBank = repaymentBank == null ? null : repaymentBank.trim();
    }

    public String getReceiveAccountNo() {
        return receiveAccountNo;
    }

    public void setReceiveAccountNo(String receiveAccountNo) {
        this.receiveAccountNo = receiveAccountNo == null ? null : receiveAccountNo.trim();
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
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