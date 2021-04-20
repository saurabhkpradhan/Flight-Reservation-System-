package com.upgrad;

import java.time.LocalDateTime;
// child class of ticket
public class RegularTicket extends Ticket {
    private String specialServices;

    //RegularTicket constructor
    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices)
    {
        // using super it is using parent class attributes
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        // initializing using this keyword
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
