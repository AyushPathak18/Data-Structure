import java.util.Scanner;

public class search_element_in_duplicate_roated_array {
    public static boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
    return false;      
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
        System.out.println(search(arr,x));
}
}
