package Linear;

public class Source {
    public static void main(String[]args){
        int[] arr={1,9,6,3,12,4,5};
        int target=4;
        int ans1=ls1(arr,target);
        System.out.println(ans1);
        int ans2=ls2(arr,target);
        System.out.println(ans2);
        boolean ans3=ls3(arr,target);
        System.out.println(ans3);
    }
    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int ls1(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    //search in the array : return the index if item found
    //otherwise if item not found return not found
    static int ls2(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    //search in the array : return the index if item found
    //otherwise if item not found return false
    static boolean ls3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
