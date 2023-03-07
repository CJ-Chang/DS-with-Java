package Recursion.Recursion_1_easy;

public class PrintNumbers {
    public static void printNumbersDescending(int n) {
        if(n == 0) {
        return;
        }
        System.out.println(n);
        printNumbersDescending(n-1);
        }

        public static void printNumbersAscending(int n) {
            if(n == 6) {
            return;
            }
            System.out.println(n);
            printNumbersAscending(n+1);
            }
}
