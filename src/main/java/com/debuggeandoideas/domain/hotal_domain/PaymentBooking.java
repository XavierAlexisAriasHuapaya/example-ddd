package com.debuggeandoideas.domain.hotal_domain;

import lombok.Data;

@Data
public class PaymentBooking {

    private String paymentMethod;

    private String cardNumber;

    private String cardHolderName;

    private String expirationDate;

    private String securityCode;

    private boolean bookingDiscount;

    public boolean validPaymentDetails(){
        return true;
    }
}
