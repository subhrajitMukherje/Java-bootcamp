package Linear;
// It's a Leetcode question
//Richest Customer Wealth

import java.util.Arrays;

public class q6 {
    public static void main(String[] args){
        int [][] arr={
                {12, 23, 4},
                {45, 6, 32},
                {14, 18, 19}
        };

        System.out.println(PersonWealth(arr));
    }
    static int PersonWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum =0;
            for(int account=0;account<accounts[person].length;account++){
                sum +=  accounts[person][account];
            }
            if(sum >ans){
                ans =sum;
            }
        }
        return ans;
    }
}
