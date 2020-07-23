package main.city;

import main.operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class City implements Item {
    private List<Comuna> comunas = new ArrayList<Comuna>();

    /**
     * Adds a comuna to this tests.city's list of comunas
     * @param comuna the comuna
     */
    public void add(Comuna comuna) {comunas.add(comuna);}

    /**
     * Returns this tests.city's list of comunas
     */
    public List<Comuna> comunas() {return comunas;}

    /**
     * Accepts a visitor, and signals the visitor to visit this tests.city
     * @param visitor the visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCity(this);
    }

}