// Ceiling of a number....
// celling is a smallest element in array greater or = target
public class question1 {
    public static void main(String[] arr){
        int [] ar={1,3,5,7,9,11};
        int target=6;
        int ans=celling(ar,target);
        System.out.println(ans);
    }
    static int celling(int [] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid= start+(end - start)/2;
            if(target < arr[mid]){
                end =mid-1;
            }else if(target > arr[mid]){
                start =mid +1;
            }else{
                return mid;
            }
        }
        return start;
    }
}