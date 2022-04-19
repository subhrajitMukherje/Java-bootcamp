 // Questoin link:- https://leetcode.com/problems/build-array-from-permutation/
 public int[] buildArray(int[] nums) {
         int[] b= new int[nums.length];
          for(int i=0;i<nums.length;i++){
              b[i]= nums[nums[i]];
          }
          return b;
    }