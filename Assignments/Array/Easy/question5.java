/*
Question link:-https://leetcode.com/problems/shuffle-the-array/
*/
 public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
          result[j++]=nums[i];
          result[j++]=nums[i+n];
        }
        return result;
    }