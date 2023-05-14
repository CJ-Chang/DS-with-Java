package Recursion.Recursion_3_hard;

/* 
 * Count total paths in a Maze to move from (0,0) to (n,m)
 * Condition: Either we can move towards right or down. But not diagonally.
 * 
 * Time complexity - O(2^(m+n))
 */
public class CountPathMaze {
    public static int countPaths(int i, int j, int m, int n) {
        if(i == m-1 || j == n-1) {
            return 1;
        }
 
        // move downwards
        int downPaths = countPaths(i+1, j, m, n);

        // move right
        int rightPaths = countPaths(i, j+1, m, n);
        
        return  downPaths + rightPaths;
    }
 
 
    public static void main(String args[]) {
        int m = 4, n = 5;
        // total paths
        System.out.println(countPaths(0, 0, m, n));
    }
 
}
