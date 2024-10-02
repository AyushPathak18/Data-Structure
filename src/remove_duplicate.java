import java.util.*;
public class remove_duplicate {
    public static int removes_duplicate(int arr[]){
      int i=0;
      for(int j=1;j<arr.length;j++) {
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;
        }
      }
      return i+1;
    }
    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(removes_duplicate(array));
}
}
