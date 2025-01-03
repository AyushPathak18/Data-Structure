package BinarySearchOnAnswer;

import java.util.Arrays;
import java.util.Scanner;

public class median_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
         for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        int high=n+m;
        int mid=high/2;
        if((m+n)%2==1)return arr[mid];
        else {
                int ans=(arr[mid]+arr[mid-1]);;
                return ans/2.0;
            }
           
        }
         public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int b = sc.nextInt();
        int arrr[]=new int[b];
        for(int i=0;i<b;i++){
            arrr[i]=sc.nextInt();
         }
         System.out.println(findMedianSortedArrays(arr,arrr));
}
}
    
