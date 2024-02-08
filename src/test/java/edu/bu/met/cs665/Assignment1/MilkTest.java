package edu.bu.met.cs665.Assignment1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class MilkTest {

    @Test
    public void testAddMilk_Successful() {
        //Given
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double initialCost = 0.0;

        //When
        double updatedCost = Milk.addMilk(initialCost);

        //Then
        assertEquals(2.0 * Price.condimentPrice, updatedCost);
    }

    @Test
    public void testAddMilk_ExceedMaxLimit() {
        //Given
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double initialCost = 0.0;

        //When
        double updatedCost = Milk.addMilk(initialCost);

        //Then
        assertEquals(0.0, updatedCost);
    }
}
