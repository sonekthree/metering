package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.Payment;

import java.util.List;

@Dao
public interface PaymentDAO {
    @Insert
    void insertPayment(Payment payment);

    @Update
    void updatePayment(Payment payment);

    @Delete
    void deletePayment(long paymentId);

    @Query("SELECT * FROM Payment")
    List<Payment> getPaymentList();
}
