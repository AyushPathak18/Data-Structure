import java.util.*;;
public class insertionsort { 
    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j=i;
            while (j>0 && array[j-1]>array[j]){
                int temp=array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
                j--;
            }
        }
        System.out.println("After Selction Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); 
        }
    
}
}
