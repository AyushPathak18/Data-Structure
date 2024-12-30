package BinarySearchOnAnswer;

import java.util.Scanner;

public class koko_banana {
    public static int max(int arr[]){
        int n=arr.length;
        int m=0;
        for(int i=0;i<n;i++){
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    public static int func(int arr[],int hourly){
        int n=arr.length;
        int totalH=0;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalH;
    }
    public static int search(int arr[],int n){
        int low=0;
        int high=max(arr);
        int mid=0;
        while(low<=high){
             mid=(low+high)/2;
            int rtime=func(arr,mid);
            if(rtime<=n){
                high=mid-1;
            }
            else low=mid+1;
        }
        return mid;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.err.println("enter the element");
         int b=sc.nextInt();
         System.out.println(search(arr,b));
    
}
}

