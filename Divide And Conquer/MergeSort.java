//step 1: Divide--find mid element
//step 2: recusive call for left and right part mergesort(left) & mergesort(right)

// merge using temp array(left elements  and right elements)

public class MergeSort {
     public static void mergesortalgo(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaaam
        int mid = si+(ei-si)/2;
        mergesortalgo(arr, si, mid); //left part
        mergesortalgo(arr, mid+1, ei); //right part

        merge(arr, si,mid,ei);
     }

     public static void merge(int arr[], int si, int mid,int ei){
        int[] temp = new int[ei-si+1];
        int i = si; //for left part iteratot
        int j = mid+1; //iterator for left part
        int k =0; //iterator for temp

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
     }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergesortalgo(arr, 0, arr.length-1);
    
    }
    
}
