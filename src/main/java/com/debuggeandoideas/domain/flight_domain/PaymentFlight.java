package com.debuggeandoideas.domain.flight_domain;

import lombok.Data;

@Data
public class PaymentFlight {

    private String paymentMethod;

    private String cardNumber;

    private String cardHolderName;

    private String expirationDate;

    private String securityCode;

    private String visaId;

    private boolean flightDiscount;

    public boolean validPaymentDetails(){
        return true;
    }

}
