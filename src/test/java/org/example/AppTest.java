package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void definitelyNotFlaky()
    {
        Random random = new Random();
        assertTrue( random.nextDouble() > 0.3 );
    }
}
