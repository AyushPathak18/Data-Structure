import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static String twosum(int arr[],int n,int target){
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "yes";
            }
            else if(sum<target) {
                left++;
            }
            else right--;
        }
        return "no";
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target=sc.nextInt();
        System.out.println(twosum(array,n,target));
}
    }
