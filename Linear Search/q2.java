package Linear;
// Search in RANGE.....
public class q2 { public static void main(String[]args){
  int []arr={18,2,5,12,32,3,13,8};
  int target=3;
  System.out.println(LinearSearch(arr,target,1,5));
    }
    static int LinearSearch(int []arr, int target,int start,int end){
        if(arr.length ==0){
            return -1;
        }
        for(int index= start;index<=end;index++){
            int element= arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
