import java.util.Scanner;
import java.util.*;
public class left_rotate_array_by_one {
    public static void rotate_array(int arr[]){
      int temp=arr[0];
      for(int j=0;j<arr.length-1;j++) {
       arr[j]=arr[j+1];
    }
    arr[arr.length-1]=temp;
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
}
    }
    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
       rotate_array(array);
}
}
