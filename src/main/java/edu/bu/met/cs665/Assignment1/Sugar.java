package edu.bu.met.cs665.Assignment1;

import java.util.Scanner;

public class Sugar extends Condiment{
    /**
     * Adds sugar to the beverage, updating the cost and quantity of available sugar.
     * @param cost The current cost of the beverage.
     * @return The updated cost of the beverage after adding sugar.
     */
    public static double addSugar(double cost) {
        double addedSugarQuantity;
        Scanner sc = new Scanner(System.in);

        selectQuantity(condimentList[1]);
        addedSugarQuantity = sc.nextInt();

        if (addedSugarQuantity > maxSugar) {
            System.out.println(maxSugarError);
        }
        else {
            maxSugar -= (int) addedSugarQuantity;
            cost += addedSugarQuantity * Price.condimentPrice;
            System.out.println("Sugar added to the beverage.");
        }
        return cost;
    }
}
