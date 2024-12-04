/*
 * Programming Project
 */

package model;

import java.math.BigInteger;

public class Iterative {

    /** My count. */
    private static BigInteger myCount;
    
    /** Constructor. */
    public Iterative() {
        myCount = BigInteger.ZERO;
    }
    
    public static BigInteger fib(final int theNum) {
        if (theNum < 2) {
            return BigInteger.valueOf(theNum);
        }
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger fib = BigInteger.ZERO;
        
        for (int i = 2; i <= theNum; i++) {
            fib = a.add(b);
            myCount = myCount.add(BigInteger.ONE);
            a = b;
            b = fib;
        }
        return fib;
    }
    
    /** Getter method for the count. */
    public BigInteger getCount() {
        return myCount;
    }  
}