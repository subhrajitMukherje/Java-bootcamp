package pattern;

import java.util.*;
public class pattern6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("nubers");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int k=i;k>=1;k--) {
			System.out.print(k+" ");
		}
		for(int l=2;l<=i;l++) {
			System.out.print(l+" ");
		}
		System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
		for(int k=i;k>=1;k--) {
			System.out.print(k+" ");
		}
		for(int l=2;l<=i;l++) {
			System.out.print(l+" ");
		}
		System.out.println();
	}
	}

}