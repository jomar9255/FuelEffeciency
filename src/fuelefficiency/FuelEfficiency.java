/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;
import fuelefficiency.Vehicles.Car;
import fuelefficiency.Vehicles.HybridCar;
import fuelefficiency.Vehicles.Motorcycle;
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
        v[0] = new Car(50);
        v[1] = new Truck(50);
        v[2] = new Motorcycle(50);
        v[3] = new HybridCar(50);
  
        int j = -1;    
        for(Vehicle i : v){
            j++;
            System.out.println(v[j].getDistance());   
        }
    }
    
}
