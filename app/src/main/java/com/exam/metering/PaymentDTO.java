package com.exam.metering;

import java.io.Serializable;

public class PaymentDTO implements Serializable {
    String paymentId;
    String userId;
    String cardNum;
    String cardName;
    String cardDate;

    public PaymentDTO(String userId, String cardNum, String cardName, String cardDate) {
        this.userId = userId;
        this.cardNum = cardNum;
        this.cardName = cardName;
        this.cardDate = cardDate;
    }

    public PaymentDTO(String paymentId, String userId, String cardNum, String cardName, String cardDate) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.cardNum = cardNum;
        this.cardName = cardName;
        this.cardDate = cardDate;
    }

    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getCardNum() { return cardNum; }
    public void setCardNum(String cardNum) { this.cardNum = cardNum; }

    public String getCardName() { return cardName; }
    public void setCardName(String cardName) { this.cardName = cardName; }

    public String getCardDate() { return cardDate; }
    public void setCardDate(String cardDate) { this.cardDate = cardDate; }
}
