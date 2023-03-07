package Recursion.Recursion_3_hard;

import java.util.ArrayList;

/* 
 * Print all the Subsets of a set of first n natural numbers
 * 
 * Time complexity - O(2^n)
 */

public class PrintSubsetsOfSet {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
 
 
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubsets(subset);
            return;
        }
 
 
        findSubsets(n-1, subset);
        subset.add(n);

        findSubsets(n-1, subset);
        subset.remove(subset.size() - 1);
    }
 
 
    public static void main(String args[]) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer> ());// can be called in this way as well

        // can be called in this way as well
        /* ArrayList<Integer> subset2 = new ArrayList<>();
        findSubsets(n, subset2);  */
    }
 
}
