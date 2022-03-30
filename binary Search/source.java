// It only works in a sorted array
public class source {
    public static void main(String[]args){
        int [] arr={1,3,5,7,11,13,18};
        int target=1;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }
    // return this index
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            //int mid=(start+end)/2;
            // it has a problem that integer value has fixed size...
            //might be posible that (start+end) exceeds the range of int in java
            // better way to find mid
            int mid= start+(end - start)/2;
            if(target < arr[mid]){
                end =mid-1;
            }else if(target > arr[mid]){
                start =mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}