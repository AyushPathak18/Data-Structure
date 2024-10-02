import java.util.*;
public class element_is_sorted {
    public static boolean sorted_or_not(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
                
            }     
        }
        return true;  
    }
    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(sorted_or_not(array));
}
}