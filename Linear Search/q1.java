package Linear;

public class q1 {
    public static void main(String[]args){
        String name="Mia khalifa";
        char target= 'b';
        System.out.println(Search(name,target));
    }
    static boolean Search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int index= 0;index<str.length();index++){
            if(target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
