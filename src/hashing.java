import java.util.*;
public class hashing {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("number");
        int b = sc.nextInt();
        int hash[]= new int[12];
        for (int i = 0; i<hash.length; i++) {
            hash[i]=0;
        }
        for (int i = 0; i < n; i++) {
            hash[array[i]]+=1;
        }
        System.out.println(hash[b]);

    }
}
