public class decending {
    public static void main(String[] args) {
        int[] arr = {32, 31, 30, 28, 24, 12, 11, 8, 5, 2};
        int target = 30;
        int ans = binarySearch2(arr, target);
        System.out.println(ans);
    }

    static int binarySearch2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find The array sorted in assending or decending order
        boolean isAsc = arr[start] < arr[end];

            //int mid=(start+end)/2;
            // it has a problem that integer value has fixed size...
            //might be posible that (start+end) exceeds the range of int in java
            // better way to find mid
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else{
                        end = mid - 1;
                    }
                }
            }
        return -1;
    }
}