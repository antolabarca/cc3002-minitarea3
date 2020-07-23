package main.city;

import main.operations.Visitor;

public interface Item {
    void accept(Visitor visitor);
}
