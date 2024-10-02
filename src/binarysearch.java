import java.util.*;;
public class binarysearch {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int element=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(element==array[mid]){
                System.out.println(mid);
            }
            else if(element<array[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
    
}
}
