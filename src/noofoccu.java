import java.util.*;
public class noofoccu {
    
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count=0;
        System.out.println("number to search");
        int number=sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                count+=1;
            }
        }
        if(count>=1){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
        System.out.println(count);
}
}