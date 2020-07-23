package main.operations;

import main.city.*;

public abstract class Visitor {

    /**
     * Visits an auto
     * @param auto the auto that is visited
     */
    public void visitAuto(Auto auto){}

    /**
     * Visits a truck
     * @param truck the truck that is visited
     */
    public void visitTruck(Truck truck){}

    /**
     * Visits a city, visiting all of the comunas in it
     * @param city the city that is visited
     */
    public void visitCity(City city){
        for (Comuna comuna : city.comunas()){
            comuna.accept(this);
        }
    }

    /**
     * Visits a comuna, visiting all of the vehicles in it
     * @param comuna the comuna that is visited
     */
    public void visitComuna(Comuna comuna){
        for (Vehicle vehicle : comuna.vehicles()){
            vehicle.accept(this);
        }
    }
}
