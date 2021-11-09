package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Payment implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "payment_id") long paymentId;
    @ColumnInfo(name="user_id") long userId;
    @ColumnInfo(name="card_num") String cardNum;
    @ColumnInfo(name="card_name") String cardName;
    @ColumnInfo(name="card_date") String cardDate;

    public Payment() { }

    public Payment(long paymentId, long userId, String cardNum, String cardName, String cardDate) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.cardNum = cardNum;
        this.cardName = cardName;
        this.cardDate = cardDate;
    }

    public long getPaymentId() { return paymentId; }
    public void setPaymentId(long paymentId) { this.paymentId = paymentId; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public String getCardNum() { return cardNum; }
    public void setCardNum(String cardNum) { this.cardNum = cardNum; }

    public String getCardName() { return cardName; }
    public void setCardName(String cardName) { this.cardName = cardName; }

    public String getCardDate() { return cardDate; }
    public void setCardDate(String cardDate) { this.cardDate = cardDate; }
}
