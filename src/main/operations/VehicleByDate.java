package main.operations;

import main.city.Auto;
import main.city.Truck;
import main.city.Vehicle;

import java.util.*;

public class VehicleByDate extends Visitor {
    int year;
    List<Vehicle> vehicles;

    /**
     * Creates a VehicleByDate object
     * @param year the year
     */
    public VehicleByDate(int year) {
        this.year = year;
        this.vehicles = new ArrayList<Vehicle>();
    }

    /**
     * Returns the vehicles in this objects list
     */
    public List<Vehicle> vehiclesByYear(){
        return vehicles;
    }

    /**
     * Checks if an autos year matches this objects year
     * if it does, the auto is added to the vehicle list
     * @param auto the auto that is checked
     */
    @Override
    public void visitAuto(Auto auto) {
        if (auto.getYear()==year){
            vehicles.add(auto);
        }
    }

    /**
     * Checks if a trucks year matches this objects year
     * if it does, the truck is added to the vehicle list
     * @param truck the truck that is checked
     */
    @Override
    public void visitTruck(Truck truck) {
        if (truck.getYear()==year){
            vehicles.add(truck);
        }
    }
}
