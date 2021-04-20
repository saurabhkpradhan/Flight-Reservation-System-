package com.upgrad;

import java.time.LocalDateTime;
// abstract class
public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;



    //ticket class constructor
    public Ticket(String pnr, String from, String to, String departureDateTime,
                  String arrivalDateTime, String seatNo, float price, boolean cancelled,
                  Flight flight, Passenger passenger) {
        //initializing using this keyword
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    //method
    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    //method
    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);

        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);

        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancel() {
        cancelled = true;
    }
    //getter in pnr
    public String getPnr() {
        return pnr;
    }
    // setter in pnr
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }
    //getter in form
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    //getter in to
    public String getTo() {
        return to;
    }
    //setter in to
    public void setTo(String to) {
        this.to = to;
    }
    //getter in DepartureDateTime
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
    // getter in ArrivalDateTime
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    //setter in ArrivalDateTime
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}

