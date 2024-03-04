public class Kadane {
    public static void kadane(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum = currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("max subarraysum:" +maxsum);
    }
 public static void main(String[] args) {
    
 }

}

//NOTE: if all number is negative then check using loop if all number is negative then initialize the smallest negative number as a maxsum
