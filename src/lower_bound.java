import java.util.Scanner;

public class lower_bound {
    public static void bound(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        int mid=0;
        int ans=n;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);


    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        System.out.println("enter the element");
        int x=sc.nextInt();
        bound(arr,n,x);
    
}
}
