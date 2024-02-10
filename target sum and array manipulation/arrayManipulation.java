

public class arrayManipulation {
    //question 5
    static int findUnique(int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                ans = arr[i];
            }
        }
        return ans;
    }

    //question 6

    static int findMax(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            arr[i] = max;
        }
    }
    return max;
    }

    static int secondLargest(int[] arr){
        int largest = findMax(arr);
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == largest){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondLarge = findMax(arr);
        return secondLarge;
    }

    //question 9
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
    //without extra space
    static int[] rotateArray(int[] arr){

        return arr;
    }
}
