package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making a GreenTea beverage.
 */
public class GreenTea implements MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Green Tea added to the cart.");
    }
}
