package com.myproject.kgtracker;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Yevg on 10.09.2014.
 */
public class Person
{


    private static ArrayList<String> peopleList = new ArrayList<String>();
    private String name, surname, phone, address, notes;
    private short age;
    private Date checkIn, checkout, birthDate;

    public void setName(String name)
    {
        this.name = name;

    }

    public void setSurname(String name)
    {
        this.surname = name;
    }

    public Person(String name, String surname, String phone)
    {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Person(String name, String surname, String phone, String address, short age, Date birthDate)
    {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.birthDate = birthDate;
    }

    public void setAddress(String address)

    {
        this.address  = address;
    }
    public void setNotes(String notes)
    {
        this.notes  = notes;
    }

    public Date getCheckIn()
    {
        return checkIn;
    }

    public void setCheckIn(Date checkIn)
    {
        this.checkIn = checkIn;
    }

    public Date getCheckout()
    {
        return checkout;
    }

    public void setCheckout(Date checkout)
    {
        this.checkout = checkout;
    }

    public short getAge()
    {
        return age;
    }

    public void setAge(short age)
    {
        this.age = age;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }
}
