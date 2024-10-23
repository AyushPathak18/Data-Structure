import java.util.*;
public class maximum_sub_array_sum {
        public static long maxSubarraySum(int[] arr, int n) {
            long maxi = Long.MIN_VALUE; // maximum sum
            long sum = 0;
    
            for (int i = 0; i < n; i++) {
    
                sum += arr[i];
    
                if (sum > maxi) {
                    maxi = sum;
                }
    
                if (sum < 0) {
                    sum = 0;
                }
            }
    
            return maxi;
        }
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int array[] = new int[n];
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            long maxSum = maxSubarraySum(array, n);
            System.out.println("The maximum subarray sum is: " + maxSum);
    
        }
    
    }