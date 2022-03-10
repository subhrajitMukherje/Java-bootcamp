package Linear;
// Find the minimum of the array....
public class q3 {
    public static void main (String[] args){
        int [] a={45,12,36,78,10,32,6,-2};
        System.out.println(min(a));
    }
    static int min(int[]arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];

            }
        }
        return ans;
    }
}
