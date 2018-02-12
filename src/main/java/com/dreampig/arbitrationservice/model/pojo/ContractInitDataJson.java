package com.dreampig.arbitrationservice.model.pojo;

import com.dreampig.arbitrationservice.model.LenderInfo;
import com.dreampig.arbitrationservice.model.NotarialCertificateSum;

import java.util.List;

public class ContractInitDataJson {

    private byte[] fileBody;
    private String fileBodyMD5;
    private List<LenderInfo> lenderInfos;
    private NotarialCertificateSum notarialCertificateApplicatSumJson;

    public byte[] getFileBody() {
        return fileBody;
    }

    public void setFileBody(byte[] fileBody) {
        this.fileBody = fileBody;
    }

    public String getFileBodyMD5() {
        return fileBodyMD5;
    }

    public void setFileBodyMD5(String fileBodyMD5) {
        this.fileBodyMD5 = fileBodyMD5;
    }

    public List<LenderInfo> getLenderInfos() {
        return lenderInfos;
    }

    public void setLenderInfos(List<LenderInfo> lenderInfos) {
        this.lenderInfos = lenderInfos;
    }

    public NotarialCertificateSum getNotarialCertificateApplicatSumJson() {
        return notarialCertificateApplicatSumJson;
    }

    public void setNotarialCertificateApplicatSumJson(NotarialCertificateSum notarialCertificateApplicatSumJson) {
        this.notarialCertificateApplicatSumJson = notarialCertificateApplicatSumJson;
    }
}
