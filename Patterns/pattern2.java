
import java.util.Scanner;
public class pattern2 {
	public static void main(String[] args) {
		
		          Scanner sc =new Scanner(System.in);
		          System.out.print("Enter the numbers");
		          int rows=sc.nextInt();
		          System.out.println("0");
		       for(int i=rows;i>=1;i--) {
		    	   for(int j=i;j<=rows;j++) {
		    		   System.out.print(j);
		    	   }
		    	   System.out.print("0");
		    	   for(int k=rows;k>=i;k--) {
		    		   System.out.print(k);
		    	   }
		    	   System.out.println();
		       }
	}
}