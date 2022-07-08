package pattern;

import java.util.Scanner;
public class pattern3 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int rows=sc.nextInt();
	for(int i=1;i<=rows;i++) {
		int temp=i;
		for(int j=1;j<=i;j++) {
			System.out.print(temp +" ");
			int temp1= temp+1;
		}
		 int temp2=temp-2;
		 for(int k=i-1;k>=1;k--) {
			 System.out.print(k+" ");
		 }
		 System.out.println();
	}
	for(int i=rows-1;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		for(int k=i-1;k>=1;k--) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}