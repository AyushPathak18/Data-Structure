import java.util.Arrays;
import java.util.Scanner;

public class aggresive_cows {

    public static boolean possible(int[] arr,int i,int cows){
        int n=arr.length;
        int cntcows=1;
        int cowspos=arr[0];
        for(int j=1;j<n;j++){
            if((arr[j]-cowspos)>=i){
                cntcows++;
                cowspos=arr[j];
               
            }
            if(cntcows>=cows) return true;
        }
         return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int n=stalls.length;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(stalls,mid,k)==true){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.err.println("enter the element");
         int m=sc.nextInt();
         System.out.println(aggressiveCows(arr,m));
    }
}