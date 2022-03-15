package com.online.bookstore.model.payment;

public interface Payment {
    public String getPaymentId();
    public void setPaymentId(String paymentId);
    public double getPaymentAmount();
    public void setPaymentAmount(double paymentAmount);
}
