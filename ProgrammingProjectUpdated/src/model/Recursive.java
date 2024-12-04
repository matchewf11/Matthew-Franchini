/*
 * Programming Project
 */

package model;

import java.math.BigInteger;

public class Recursive {

    /** My count. */
    private static BigInteger myCount;
    
    /** Constructor. */
    public Recursive() {
        myCount = BigInteger.ZERO;
    }
    
    /**
     * Solves for the n fib num using the recurive approach.
     * 
     * @param theNum an index of the last num to be calculated.
     * @return BigInteger the fib number.
     */
    public static BigInteger fib(final BigInteger theNum) {
        if (theNum.compareTo(BigInteger.valueOf(2)) < 0) {
            return theNum;
        }
        myCount = myCount.add(BigInteger.ONE);
        return fib(theNum.subtract(BigInteger.ONE)).add(fib(theNum.subtract(BigInteger.TWO)));
    }
    
    /**
     * Getter method for the count.
     */
    public BigInteger getCount() {
        return myCount;
    }
}
