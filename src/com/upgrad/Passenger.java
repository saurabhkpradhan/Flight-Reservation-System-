package com.upgrad;

public class Passenger {
    private static int idCounter = 0;
    private int id;
    //nessted class address
    private static class Address{
        //address class attributes
        String street,city,state;
        //adress constructor
        Address(String street, String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }
    private  Address address;
    //nested class contact
    public  static class Contact{
        String name,phone,email;
        //contact class constructor
        Contact(String name,String phone,String email)
        {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    private Contact contact;

    //passenger class constructor
    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }

    public String getContactDetails() {
        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }


}
