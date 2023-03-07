package Recursion.Recursion_3_hard;

/* 
 * Place Tiles of size 1xm on the floor of size nxm
 * 
 * Time complexity - 
 */

public class PlaceTiles {
    public static int placeTiles(int n, int m) {
        if(n < m) {
            // Tile can be placed only vertically
            return 1;
        } else if(n == m) {
            // either place all the tile vertically or all horizontally
            return 2;
        }
 
        // vertically
        int verPlacements = placeTiles(n-m, m);
 
        // horizontally
        int horPlacements = placeTiles(n-1, m);

        return horPlacements + verPlacements;
    }
 
 
    public static void main(String args[]) {
        int n = 4, m = 4;
        System.out.println(placeTiles(n, m));
    }
 
}
