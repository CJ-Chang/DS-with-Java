package Array;

import java.util.Scanner;

public class MatrixSearchElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
 
 
        int[][] numbers = new int[rows][cols];
 
 
        //input
        //rows
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
 
 
        int x = sc.nextInt();

        // To avoid Resource leak, `sc` needs to be closed
        /* why closing System.in is typically not desirable?
        It's because you won't be able to read from it again. 
        i. e. you will get java.util.NoSuchElementException: No line found if you try to call (new Scanner(System.in)).nextLine() for example.
        */
        sc.close();
 
 
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                //compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
 
 
      
 
 
    }
 
}
