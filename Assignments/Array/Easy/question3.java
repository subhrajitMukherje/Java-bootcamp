//question link:-https://leetcode.com/problems/running-sum-of-1d-array/


public int[] runningSum(int[] nums) {
        int[] a=new int[nums.length];
        a[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            a[i]=a[i-1]+nums[i];
        }
        return a;
    }