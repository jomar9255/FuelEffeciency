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
public class Motorcycle extends Vehicle{
    
    public Motorcycle(){
    super();
    }
    
    public Motorcycle(double l){
    super(l);
            
    }
    
    @Override
    public double getDistance(){
       double eff = liters/(6.3/100);
       return eff;
    }
    
}
