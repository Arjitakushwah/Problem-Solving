import java.util.Scanner;

public class sort0s1s {
    static int[] twopointersort(int[] arr){
        int left = 0; //keep tracks of 0's
        int  right= arr.length-1; //keep tracks of  1's
        while(left<right){
            if (arr[left] ==1 && arr[right] == 0){
                //swap(arr,left,right);
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }


        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //step 1 to count 0's
        int count =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        //step 2 put 0's in count then 1's
        for(int i = 0;i<arr.length;i++){
            if (i<count) {
                arr[i] = 0;
                
            }else{
                arr[i]=1;
            }
        }


    }
}