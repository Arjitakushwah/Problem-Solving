import java.util.Scanner;

public class prefix{

    static void printArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
       
       }
       System.out.println(); 
    }

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] +arr[i];
        }
        return pref;
    }

    static int[] prefixWithoutNewArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    printArray(arr);
    int[] pref = makePrefixSum(arr);
    int[] pref2 = prefixWithoutNewArray(arr);
    printArray(pref2);
    printArray(pref);
}
}