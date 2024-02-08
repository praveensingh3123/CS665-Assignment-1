package edu.bu.met.cs665.Assignment1;

/**
 * This class implements the MakeBeverage interface.
 * The purpose of this class is to represent the behavior of making a BlackTea beverage.
 */
public class BlackTea implements MakeBeverage{
    @Override
    public void makeBeverage() {
        System.out.println("Black Tea added to the cart.");
    }
}
