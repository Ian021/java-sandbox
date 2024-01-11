package test.java;

import main.java.PrimeNumberChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberCheckerTest {
    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumberChecker.isPrime(2));
        assertTrue(PrimeNumberChecker.isPrime(17));
        assertTrue(PrimeNumberChecker.isPrime(19));
        assertTrue(PrimeNumberChecker.isPrime(23));
        assertFalse(PrimeNumberChecker.isPrime(4));
        assertFalse(PrimeNumberChecker.isPrime(27));
        assertFalse(PrimeNumberChecker.isPrime(1));
    }
}
