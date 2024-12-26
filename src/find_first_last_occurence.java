import java.util.*;
public class find_first_last_occurence {
        public static int lowerbound(int[] nums, int target){
            int n=nums.length;
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>=target){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
           return ans;
    
        }
         public static  int upperbound(int[] nums, int target){
            int n=nums.length;
            int low=0;
            int high=n-1;
            int ans=n;
            while(low<=high){
               int mid=(low+high)/2;
                if(nums[mid]>target){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
           return ans;
    
        }
        public static int[] searchRange(int[] nums, int target) {
             int lowerBound = lowerbound(nums, target);
            if (lowerBound == nums.length || nums[lowerBound] != target) {
                return new int[]{-1, -1};
            }
            int upperBound = upperbound(nums, target) - 1;
            
            return new int[]{lowerBound, upperBound};
        }
        public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result=searchRange(array,x);
        System.out.println(Arrays.toString(result));
    }
}
    
