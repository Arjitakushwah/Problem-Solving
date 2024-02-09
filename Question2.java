import java.util.Scanner;

public class Question2 {

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
    }
}
