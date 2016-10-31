/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;
import fuelefficiency.Vehicles.Truck;
import fuelefficiency.Vehicles.Vehicle;
/**
 *
 * @author jomar9255
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[4];
        Truck t = new Truck(50);
        System.out.println(t.getDistance());
        
    }
    
}
