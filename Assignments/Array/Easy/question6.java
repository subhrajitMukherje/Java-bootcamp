/*
Question link:- https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
*/
  public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }else{
                odd++;
            }    
        }
       return(Math.min(even,odd));
    }