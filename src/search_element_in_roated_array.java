import java.util.Scanner;

public class search_element_in_roated_array {
    public static int binarysearch(int array[],int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==x) return mid;
            if(array[low]<=array[mid]){
                if(array[low]<=x && array[mid]>=x){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else{
                if(array[mid]<=x && array[high]>=x){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        System.out.println("enter the element");
        int x=sc.nextInt();
        System.out.println(binarysearch(arr,n,x));
}
    
}
