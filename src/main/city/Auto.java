package main.city;

import main.operations.Visitor;

public class Auto extends Vehicle {

    /**
     * Creates a new Auto object
     * @param y the year the auto was made
     */
    public Auto(int y) {year = y;}

    /**
     * Accepts a visitor, signals the visitor to do its visiting auto operation
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAuto(this);
    }
}
