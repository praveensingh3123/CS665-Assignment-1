package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making an Espresso beverage.
 */
public class Espresso implements MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Espresso added to the cart.");
    }
}
