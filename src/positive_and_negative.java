import java.util.Scanner;

public class positive_and_negative {

    public static void brute_force(int[] arr,int n){
        int v=n/2;
        int posv[]=new int[v];
        int neg[]=new int[v];
        int temp[]=new int[n];
        int posIndex = 0, negIndex = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && posIndex < v) {
                posv[posIndex++] = arr[i];
            } else if (negIndex < v) {
                neg[negIndex++] = arr[i];
            }
        }
        for(int i=0;i<v;i++){
                temp[2*i]=posv[i];
                temp[(2*i)+1]=neg[i];
            }
        for (int i = 0; i < n; i++) {
               System.out.print(temp[i]+" ");
            }
        }
    public static void optimal(int[] arr,int n){
        int temp[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[neg]=arr[i];
                neg+=2;
               
            }
            else {
                temp[pos]=arr[i];
                pos+=2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
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
    brute_force(array,n);
    optimal(array,n);
    }
}
