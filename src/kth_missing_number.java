import java.util.Scanner;

public class kth_missing_number {
    public static int missingNumber(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else high=mid-1;
        }
        return low+k;
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
         System.out.println(missingNumber(arr, m));
    }
    
}
