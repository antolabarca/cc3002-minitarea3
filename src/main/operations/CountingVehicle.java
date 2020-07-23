package main.operations;

import main.city.Auto;
import main.city.Truck;

public class CountingVehicle extends Visitor {
    int autos;
    int trucks;

    /**
     * Creates a new CountingVehicle visitor
     */
    public CountingVehicle(){
        super();
        autos=0;
        trucks=0;
    }

    /**
     * Returns the number of autos
     */
    public int numberOfAutos(){
        return autos;
    }

    /**
     * Returns the number of trucks
     */
    public int numberOfTrucks(){
        return trucks;
    }

    /**
     * Adds one to this objects auto counter
     * @param auto the auto that is counted
     */
    @Override
    public void visitAuto(Auto auto) {
        autos++;
    }

    /**
     * Adds one to this objects truck counter
     * @param truck the truck that is counted
     */
    @Override
    public void visitTruck(Truck truck) {
        trucks++;
    }

}
