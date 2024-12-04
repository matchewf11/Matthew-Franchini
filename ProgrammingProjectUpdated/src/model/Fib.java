/*
 *Programming Project
 */

package model;

import java.math.BigInteger;

/**
 * Fib number solvers.
 * 
 * @author Matthew Franchini
 * @version Autumn 2024
 */
public final class Fib {

    /**
     * Private Constructor.
     */
    private Fib() {
        //empty constructor
    }
    
    /**
     * Solves problem iterative and gives runtime.
     * 
     * @param theNum the nth fib num to be solved.
     * @return long the runtime in nanoTime
     */
    public static long fibNumIte(final int theNum) {
        
        final long startTime = System.nanoTime();
        final BigInteger fibNum = iterative(theNum);
        final long endTime = System.nanoTime();
        final long timePassed = endTime - startTime;
        
        return timePassed;
    }
    
    /**
     * Solves problem recursive and gives runtime.
     * 
     * @param theNum the nth fib num to be solved.
     * @return long the runtime in nanoTime.
     */
    public static long fibNumRec(final int theNum) {
        
        final long startTime = System.nanoTime();
        final BigInteger fibNum = recursive(BigInteger.valueOf(theNum));
        final long endTime = System.nanoTime();
        final long timePassed = endTime - startTime;
        
        return timePassed;
    }
    
    /**
     * Solves for the n fib num using the iterative approach.
     * 
     * @param theNum an index of the last num to be calculated.
     * @return BigInteger the fib number.
     */
    private static BigInteger iterative(final int theNum) {
        
        if (theNum < 2) {
            return BigInteger.valueOf(theNum);
        }
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger fib = BigInteger.ZERO;
        
        for (int i = 2; i <= theNum; i++) {
            fib = a.add(b);
            a = b;
            b = fib;
        }
        return fib;

    }
    
    /**
     * Solves for the n fib num using the recurive approach.
     * 
     * @param theNum an index of the last num to be calculated.
     * @return BigInteger the fib number.
     */
    private static BigInteger recursive(final BigInteger theNum) {
        
        if (theNum.compareTo(BigInteger.valueOf(2)) < 0) {
            return theNum;
        }
        return recursive(theNum.subtract(BigInteger.ONE)).add(recursive(theNum.subtract(BigInteger.TWO)));
    }
}
