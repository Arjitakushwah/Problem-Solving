


///question: given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
//{given the array of height}

//pani trapped = (pani ki height(w) - bar ki height(x))* width
//(water level - bar lever/height)*width
 //water level/pani ki height = min(max-left-boundary, max-right-boundary)

 //auxilary array will be used 
 //left-max-boundary and right-max-boundary will be stored in auxilary array
//pani ko trap hone ke liye side me boundary chahiye
//min number of bar required will be >2
//no water is trapped for ascending order and descending order bars
public class trapping_rain_water {

    public static int trappedRainWater(int height[]){
        //calculate left max boundary - array
        int n = height.length;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calclate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = n-2; i > 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i-1]);
        }

        //loop
        int trappedWater=0;
        for (int i = 0; i < n; i++) {
            //waterlevel - min(left,right)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //water trapped = waterlevel - height[i]
            trappedWater += waterLevel-height[i];
        }
        
        
        return trappedWater;
    }
    public static void main(String[] args) {
        
    }
}
