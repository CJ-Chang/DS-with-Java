package Recursion.Recursion_3_hard;

/* 
 * Friends pairing problem
 * Find the number of ways in which you can invite n people to your party, single or in pairs
 * 
 * Time complexity - 
 */
public class PairFriends {
    public static int pairFriends(int n) {
        if(n <= 1) {
            return 1;
        }
  
        // single guest
        int waysForSingle = pairFriends(n-1);

        // paired guest
        int waysForPair = (n-1) * pairFriends(n-2);
  
         return  waysForSingle + waysForPair;
     }
  
  
     public static void main(String args[]) {
         int n = 3;
         System.out.println(pairFriends(n));
     }
  
}
