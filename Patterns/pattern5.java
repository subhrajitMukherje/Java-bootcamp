package pattern;

import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(temp+" ");
			}
			temp ++;
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int k=i;k>=1;k--) {
				System.out.print(temp+" ");
			}
			temp++;
			System.out.println();
		}

	}

}