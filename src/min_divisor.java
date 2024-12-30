package BinarySearchOnAnswer;

import java.util.Scanner;

public class min_divisor {
        public static int sum(int arr[],int m){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum += Math.ceil((double)(arr[i]) / (double)(m));
            }
            return sum;
        }
        public static int smallestDivisor(int[] nums, int threshold) {
            int low=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);
            }
            int high=max;
            while(low<=high){
                int mid=(low+high)/2;
                if(sum(nums,mid)<=threshold) high=mid-1;
                else low=mid+1;
            }
            return low;
            
        }
         public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.err.println("enter the element");
         int m=sc.nextInt();
         System.out.println(smallestDivisor(arr,m));
    }

}
