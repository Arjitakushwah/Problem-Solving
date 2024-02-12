


public class squaressort {
    static int[] sortSquares(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int[] ans = new int[arr.length];
        int k = 0;
        while(left<right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
