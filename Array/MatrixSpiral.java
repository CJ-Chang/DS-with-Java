package Array;

import java.util.Scanner;

/* 
Print the spiral order matrix as output for a given matrix of numbers. 

Spiral order: clock-wise
    top-Left --> top-right --> bottom-right --> bottom-left 
 */

/* 
APPROACH : 
Algorithm: (We are given a 2D matrix of n X m ).
1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_start
to column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.

 */
public class MatrixSpiral {
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
  
  
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
  
  
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
  
  
            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
  
  
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
  
  
            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
  
  
            System.out.println();
        }
     }
  
}
