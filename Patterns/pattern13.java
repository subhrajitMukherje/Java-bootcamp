package pattern;

import java.util.*;
public class pattern13 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int c=sc.nextInt();
	for(int i=1;i<=c;i++) {
	for(int j=1;j<i;j++) {
		System.out.print("0");
	}
	System.out.print(i+"");
	for(int k=i;k<c;k++) {
		System.out.print("0");
	}
	System.out.println();
	}
	}

}