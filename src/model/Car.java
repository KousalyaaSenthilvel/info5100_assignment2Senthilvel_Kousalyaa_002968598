/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author dineshmurugesan
 */
public class Car {
    
    private boolean Availability;
    private int MakeYear;
    private String ModelNumber;
    private String Manufacturer;
    private int SeatCapacity;
    private int SerialNumber;
    private String City;
    private boolean MaintainCertificate;

    public boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public int getMakeYear() {
        return MakeYear;
    }

    public void setMakeYear(int MakeYear) {
        this.MakeYear = MakeYear;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public void setSeatCapacity(int SeatCapacity) {
        this.SeatCapacity = SeatCapacity;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public boolean getMaintainCertificate() {
        return MaintainCertificate;
    }

    public void setMaintainCertificate(boolean MaintainCertificate) {
        this.MaintainCertificate = MaintainCertificate;
    }
    
    @Override
    public String toString() {
        return ModelNumber;
    }

}
