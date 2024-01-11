package main.java;

public class PrimeNumberChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
