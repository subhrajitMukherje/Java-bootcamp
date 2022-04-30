/*
Question link:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
 public int removeDuplicates(int[] nums) {
        if(nums.length==0|| nums.length==1){
            return nums.length;
        }
        int n=0;
        int a=nums[0];
        for(int i=1 ;i<nums.length;i++){
            if(nums[n] != nums[i])
            n++;
            if(n != i){
                nums[n] = nums[i];        
                }
        }
        return n+1;
    }