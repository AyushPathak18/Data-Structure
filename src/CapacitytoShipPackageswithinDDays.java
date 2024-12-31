package BinarySearchOnAnswer;

import java.util.Scanner;

public class CapacitytoShipPackageswithinDDays {
    public static int func(int weight[],int mid){
        int load=0;
        int days=1;
        for(int i=0;i<weight.length;i++){
            if(load+weight[i]>mid){
                days++;
                load=weight[i];
            }
            else load+=weight[i];
        }
        return days;
    }
    public static int mindays(int weight[],int days){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weight.length;i++){
            sum+=weight[i];
            max=Math.max(max,weight[i]);
        }
        int high=sum;
        int low=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(weight,mid)<=mid){
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
         System.err.println("enter the days");
         int m=sc.nextInt();
         System.out.println(mindays(arr,m));
    }
    
}
