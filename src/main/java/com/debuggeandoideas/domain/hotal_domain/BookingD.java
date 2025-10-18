package com.debuggeandoideas.domain.hotal_domain;

import com.debuggeandoideas.basedOnData.Hotel;
import com.debuggeandoideas.basedOnData.Room;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingD {

    private Long id;

    private Long customerId;

    private Hotel hotel;

    private Room room;

    private double price;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    public void calculatePrice(double taxRate){
        final var roomPrice = room.getPrice();
        this.setPrice(roomPrice + taxRate);
    }

    public void changeCheckInDate(LocalDate newCheckInDate){
        this.setCheckInDate(newCheckInDate);
    }

    public void changeCheckOutDate(LocalDate newCheckOutDate){
        this.setCheckOutDate(newCheckOutDate);
    }

}
