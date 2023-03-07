package Array;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
  
  
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++) {
                 matrix[i][j] = sc.nextInt();
             }
        }

         // To avoid Resource leak, `sc` needs to be closed
        /* why closing System.in is typically not desirable?
        It's because you won't be able to read from it again. 
        i. e. you will get java.util.NoSuchElementException: No line found if you try to call (new Scanner(System.in)).nextLine() for example.
        */
        sc.close();
  
  
        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     }
  
}
