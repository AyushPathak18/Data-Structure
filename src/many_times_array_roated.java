import java.util.*;
class many_times_array_roated{
    public static int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
               if(nums[low]<ans){
                index=low;
                ans=nums[low];
               }
                low=mid+1;
            }
            else{
                if(nums[mid]<ans){
                    index=mid;
                    ans=nums[mid];
                }
                high=mid-1;
            }    
        }
        return index;
    }

     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(findMin(arr));
    
}
}