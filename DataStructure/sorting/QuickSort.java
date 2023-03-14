/* 
 * Time Complexity

Worst : O(n^2)

Average : O(nlogn)


Worst case occurs when pivot is always the smallest or the largest element. i.e SORTED array (asc or desc)

 */

package DataStructure.sorting;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // last element
        int i = low - 1; // to track the element lower than pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        // swap with pivot
        i++; // space for pivot
        int tmp = arr[i];
        arr[i] = arr[high];
        arr[high] = tmp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // pivot index
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // print the sorted elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
