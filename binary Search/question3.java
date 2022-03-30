//Find smallest letter greater than Target
public class question3 {
    public static void main(String[]args) {

    }
    static int smallestNumber(char []letter,char target){
        int start=0;
        int end = letter.length-1;
        while (start<=end){
            int mid=start+(end - start)/2;
             if(target<letter[mid]){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
        }
    return letter[start % letter.length];
    }
}