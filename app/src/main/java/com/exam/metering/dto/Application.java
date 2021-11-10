package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Application implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "appli_id") long appliId;
    @ColumnInfo(name = "user_id") long userId;
    @ColumnInfo(name = "class_id") long classId;
    @ColumnInfo(name = "start_date") String startDate;
    @ColumnInfo(name = "end_date") String endDate;
    @ColumnInfo(name = "payment_id") long paymentId;
    @ColumnInfo(name = "payment_cycle") int paymentCycle;

    public Application() { }

    public Application(long appliId, long userId, long classId, String startDate, String endDate, long paymentId, int paymentCycle) {
        this.appliId = appliId;
        this.userId = userId;
        this.classId = classId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentId = paymentId;
        this.paymentCycle = paymentCycle;
    }

    public long getAppliId() { return appliId; }
    public void setAppliId(long appliId) { this.appliId = appliId; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public long getClassId() { return classId; }
    public void setClassId(long classId) { this.classId = classId; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public long getPaymentId() { return paymentId; }
    public void setPaymentId(long paymentId) { this.paymentId = paymentId; }

    public int getPaymentCycle() { return paymentCycle; }
    public void setPaymentCycle(int paymentCycle) { this.paymentCycle = paymentCycle; }
}