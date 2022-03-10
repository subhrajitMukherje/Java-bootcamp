package Linear;
// Leetcode Question ...
//Find numbers with Even Number of Digits
public class q5 {
    public static void main(String[] args){
        int [] num={12,210,312,458,75612,3214,4587,-256478};
        int D=2310;
        System.out.println("Total Numbers of Even numbers:-");
        System.out.println(findNumbers(num));
        System.out.println("Total numbers are present in the number of "+D);
        System.out.println(digits2(D));
    }
    static int findNumbers(int [] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }


    static boolean even (int num) {
        int number = digits2(num);
        /*
        if (mumber %2 == 0){
            return true;
        }
        return false;
         */
        return number %2 ==0;
    }
    // Optimised Way to slove the question....
      static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
      }
    static int  digits(int num){
        if(num <0){
            num=num*-1;
        }
        if (num == 0) {
            return 1;
        }
        int count =0;
        while (num>0){
            count ++;
            num/=10;
        }
        return count;
    }
}
