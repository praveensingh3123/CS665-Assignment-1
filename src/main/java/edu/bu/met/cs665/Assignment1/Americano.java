package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making an Americano beverage.
 */
public class Americano implements MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Americano added to the cart.");
    }
}
