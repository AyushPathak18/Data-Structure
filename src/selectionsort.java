import java.util.*;
public class selectionsort {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Before Selction Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); 
        }
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if (array[j]<array[mini]) {
                    mini=j;
                }
            int temp=array[mini];
            array[mini]=array[i];
            array[i]=temp;
            }
        }
        System.out.println("After Selction Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); 
        }
}
}
