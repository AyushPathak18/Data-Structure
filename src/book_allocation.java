package BinarySearchOnAnswer;

import java.util.Scanner;

public class book_allocation {
    public static int allocation(int arr[],int mid){
        int count=1;
        int pagescnt=0;
        for(int i=0;i<arr.length;i++){
            if(pagescnt+arr[i]<=mid){
                pagescnt+=arr[i];
            }
            else{
                count++;
                pagescnt=arr[i];
            }
        }
        return count;
    }
    public static int book(int arr[],int k){
        if(k>arr.length) return -1;
        int low=arr[0];
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(allocation(arr,mid)>k)low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the n0 of books");
        int b=sc.nextInt();
        System.out.println(book(arr, b));
    }
}
