package BinarySearchOnAnswer;

import java.util.Scanner;

public class min_days_boquet {
        public static boolean possible(int[]arr,int mid,int m, int k){
            int n=arr.length;
            int count=0;
            int nbqt=0;
            for(int i=0;i<n;i++){
                if(arr[i]<=mid){
                    count++;
                    if(count==k){
                        nbqt++;
                        count=0;
                    }
                }
                else count=0;
            }
            return nbqt>=m;
        }
    
        public static int minDays(int[] arr, int m, int k) {
            long val = (long) m * k;
            int n = arr.length; 
            if (val > n) return -1;
            int mini=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mini=Math.min(mini,arr[i]);
                max=Math.max(max,arr[i]);
            }
            int low=mini; 
            int high=max;
            while(low<=high){
                int mid=(low+high)/2;
                if(possible(arr,mid,m,k)){
                    high=mid-1;
                }
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
         int k=sc.nextInt();
         System.out.println(minDays(arr,m,k));
    
}
    }


