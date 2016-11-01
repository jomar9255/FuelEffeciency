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
public class HybridCar extends Vehicle{
    
    public HybridCar(){
    super();
    }
    
    public HybridCar(double l){
    super(l);
            
    }
    
    @Override
    public double getDistance(){
       double eff = liters/(3.8/100);
       return eff;
    }
    
}
