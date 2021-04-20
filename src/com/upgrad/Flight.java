package com.upgrad;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    //flight constructor
    public Flight(String flightNumber,String airline,int capacity, int bookedSeats)
    {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    //getter flight no
    public String getFlightNumber(){
        return  flightNumber;
    }
    //setter flightnumber
    public void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }
    //getter airline
    public  String getAirline(){
        return airline;
    }
    //setter airline
    public void setAirline(String airline){
        this.airline=airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    //method .....................
    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    // check and return true or false  thats why boolean
    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    public void incrementBookingCounter() {
        bookedSeats++;
    }





}
