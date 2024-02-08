package edu.bu.met.cs665.Assignment1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class SugarTest {

    @Test
    public void testAddSugar_Successful() {
        //Given
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double initialCost = 0.0;

        //When
        double updatedCost = Sugar.addSugar(initialCost);

        //Then
        assertEquals(3.0 * Price.condimentPrice, updatedCost);
    }

    @Test
    public void testAddSugar_ExceedMaxLimit() {
        //Given
        String input = "4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double initialCost = 0.0;

        //When
        double updatedCost = Sugar.addSugar(initialCost);

        //Then
        assertEquals(0.0, updatedCost);
    }
}
