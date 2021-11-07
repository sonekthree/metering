package com.exam.metering;

import java.io.Serializable;
import java.util.Date;

public class ApplicationDTO implements Serializable {
    String appliId;
    String userId;
    String classId;
    Date startDate;
    Date endDate;
    String paymentId;
    int paymentCycle;

    public ApplicationDTO(String userId, String classId, Date startDate, Date endDate, String paymentId, int paymentCycle) {
        this.userId = userId;
        this.classId = classId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentId = paymentId;
        this.paymentCycle = paymentCycle;
    }

    public ApplicationDTO(String appliId, String userId, String classId, Date startDate, Date endDate, String paymentId, int paymentCycle) {
        this.appliId = appliId;
        this.userId = userId;
        this.classId = classId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentId = paymentId;
        this.paymentCycle = paymentCycle;
    }

    public String getAppliId() { return appliId; }
    public void setAppliId(String appliId) { this.appliId = appliId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getClassId() { return classId; }
    public void setClassId(String classId) { this.classId = classId; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public int getPaymentCycle() { return paymentCycle; }
    public void setPaymentCycle(int paymentCycle) { this.paymentCycle = paymentCycle; }
}