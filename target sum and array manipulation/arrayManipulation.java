

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
}
