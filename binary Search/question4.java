//Find First and Last Position of Element in Sorted Array
public class question4{
    public static void main(String[] args){
        int[] num={6,8,9,9,9,9,9,10,12,15};
        int target=9;
        System.out.println(searchinRange(num,target));
    }
    public int[] searchinRange(int[] num, int target){
       int[] ans={-1,-1};
       ans[0]=search(num,target,true);
       if(ans[0]!=-1){
           ans[1]=search(num,target,false);
       }
       return ans;
    }
     int search(int[] arr,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid= start+(end - start)/2;
            if(target < arr[mid]){
                end =mid-1;
            }else if(target > arr[mid]){
                start =mid +1;
            }else{
                ans= mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
