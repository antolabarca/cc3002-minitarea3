package main.city;

import main.operations.Visitor;

public class Truck extends Vehicle {

    /**
     * Creates a truck object
     * @param y the year it was made
     */
    public Truck(int y) {year = y;}

    /**
     * Accepts a visitor, and signals the visitor to perform its visiting truck action
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTruck(this);
    }
}