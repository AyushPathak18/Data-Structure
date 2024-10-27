import java.util.*;
public class leader_in_array {
    public static void leader(int[] array,int n){
        int j=0;
        int max=-1;
        List<Integer> leaders = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                leaders.add(max);

            }
        }
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        leader(array,n);
    }
    
}
