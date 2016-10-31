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
public class Truck extends Vehicle{
    
    public Truck(){
    super();
    }
    
    public Truck(double l){
    super(l);
            
    }
    
    @Override
    public double getDistance(){
       double eff = liters/(14.1/100);
       return eff;
    }
}
