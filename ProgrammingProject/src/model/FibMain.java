/*
 * Programming Project. 
 */

package model;

/**
 * Start of the Program.
 * 
 * @author Matthew Franchini
 * @version Autumn 2024
 */
public final class FibMain {

    /**
     * Private constructor.
     */
    private FibMain() {
        //empty constructor
    }
    
    /**
     * The start of the program.
     * 
     * @param theArgs not used
     */
    public static void main(final String[] theArgs) {
        
        //amount of times to test each value in each method
        final int trialNum = 20;
        //the nth place of the Fib sequence to solve for
        final int[] testValues = {5, 10, 15, 20, 25, 30, 35};
        
        for (int j = 0; j < testValues.length; j++) {
            System.out.println("Iterative for value: " + testValues[j]);
            for (int i = 0; i < trialNum; i++) {
                System.out.print(Fib.fibNumIte(testValues[j]) + ", ");
            }
            System.out.println("");
        }
        for (int j = 0; j < testValues.length; j++) {
            System.out.println("Recursive for value: " + testValues[j]);
            for (int i = 0; i < trialNum; i++) {
                System.out.print(Fib.fibNumRec(testValues[j]) + ", ");
            }
            System.out.println("");

        }
    }
}
