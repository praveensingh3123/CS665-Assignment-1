package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making a LatteMacchiato beverage.
 */
public class LatteMacchiato implements  MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Latte Macchiato added to the cart.");
    }
}
