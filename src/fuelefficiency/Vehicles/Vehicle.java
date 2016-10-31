/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency.Vehicles;

/**
 *
 * @author jomar9255
 */
public abstract class Vehicle {

    protected double liters;
    
    public Vehicle(){
    liters = (Math.random() * 10) + 9;
    }
    
    public Vehicle(double l){
        liters = l;
    }
    
    abstract public double getDistance();
        
    
}
