import java.util.*;
public class bubblesort {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Before Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); 
        }
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if (array[j]>array[j+1]) {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    
                }
            }
        }
        System.out.println("After Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); 
        }    
}
}
