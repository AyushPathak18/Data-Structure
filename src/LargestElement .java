import java.util.Scanner;

 class LargestElement {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Initialize max with the first element of the array
        int max = array[0];
        
        // Find the maximum element
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        // Output the largest element
        System.out.println(max);
        
        // Close the scanner
        sc.close();
    }
}
