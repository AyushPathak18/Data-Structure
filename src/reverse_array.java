import java.util.*;

public class reverse_array {
    
    // Reverse the subarray from index `low` to `high`
    public static void reverse_array1(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    
    // Reverse array by `d` places
    public static void reverse_array_by_d_places(int arr[], int n, int d) {
        // Reverse the first `d` elements
        if(d>n){
            d=d%n;
        }
        reverse_array1(arr, 0, d - 1);
        
        // Reverse the remaining `n - d` elements
        reverse_array1(arr, d, n - 1);
        
        // Reverse the entire array
        reverse_array1(arr, 0, n - 1);
        
        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input number of places to rotate (d)
        System.out.println("Enter the number of places to rotate (d):");
        int d = sc.nextInt();
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Rotate array by d places
        reverse_array_by_d_places(array, n, d);
    }
}

