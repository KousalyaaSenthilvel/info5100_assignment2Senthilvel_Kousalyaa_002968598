/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dineshmurugesan
 */
public class CarsDataBase {
    
    private ArrayList<Car> CarsDb;
    private String lastUpdatedTime;

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
    public CarsDataBase(){
        this.CarsDb = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarsDb() {
        return CarsDb;
    }

    public void setCarsDb(ArrayList<Car> CarsDb) {
        this.CarsDb = CarsDb;
    }

    public Car addNewCars(){
        lastUpdatedTime = new Date().toString();
        Car newCars = new Car();
        CarsDb.add(newCars);
        return newCars;
    }
    
    public void deleteVitals(Car cdb){
        lastUpdatedTime = new Date().toString();
        CarsDb.remove(cdb);
    }
    
    public Car updateCars(int i, Car uc) {
        lastUpdatedTime = new Date().toString();
        CarsDb.set(i, uc);
        return uc;
    }
    
    public boolean isUnique(String serialNo) {
        for(Car car : CarsDb) {
            if(car.getSerialNumber() == Long.valueOf(serialNo))
                return false;
            }
        
            return true;
}
}
