import java.util.Scanner;

public class Question2 {
    static int findArraysum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraysum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int surfSum = totalSum - prefSum;
            if(surfSum==prefSum){
                return true;
            }
        }
        return false;
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
