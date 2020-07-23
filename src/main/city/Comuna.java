package main.city;

import main.operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Comuna implements Item {
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    /**
     * Adds a vehicle to this comuna's list of vehicles
     * @param v the vehicle
     */
    public void add(Vehicle v) {vehicles.add(v);}

    /**
     * Returns this comuna's list of vehicles
     */
    public List<Vehicle> vehicles() {return vehicles;}

    /**
     * Accepts a visitor, and signals the visitor to visit this comuna
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitComuna(this);
    }
}
