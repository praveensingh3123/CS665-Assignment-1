package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making a GreenTea beverage.
 */
public class YellowTea implements MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Yellow Tea added to the cart.");
    }
}
