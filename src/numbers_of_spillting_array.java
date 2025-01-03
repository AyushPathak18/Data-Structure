package BinarySearchOnAnswer;
import java.util.Scanner;

class numbers_of_spillting_array{
        public static  int waysToSplitArray(int[] nums) {
            int n=nums.length;
            long ans=0;
            for(int i=0;i<n;i++){
                 ans+=nums[i];
            }
            long right=0;
            long left=0;
            int cnt=0;
            for(int i=0;i<n-1;i++){
                left+=nums[i];
                right=ans-left;
                if(left>=right)cnt++;
            }
            return cnt;
        }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(waysToSplitArray(arr));
        }
    }

