import java.util.Scanner;

public class Question1 {

    //brute force approach
    static int Sum(int[] arr,int l,int r){
        int sum = 0;
        for (int i = l; i <= r; i++) {
                sum += arr[i];
        }
        return sum;
    }

    //optimised approach using prefix sum 
    static int[] prefixWithoutNewArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pref = prefixWithoutNewArray(arr);
        System.out.println("enter the number of queries q:");
        int q= sc.nextInt();
        while(q >0){
            System.out.println("Enter range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.println(ans);
            q--;
        }
    }
}
