
package fuelefficiency.Vehicles;

public class Car extends Vehicle{
    
    public Car(){
    super();
    }
    
    public Car(double l){
    super(l);
            
    }
    
    @Override
    public double getDistance(){
       double eff = liters/(9.4/100);
       return eff;
    }
    
}