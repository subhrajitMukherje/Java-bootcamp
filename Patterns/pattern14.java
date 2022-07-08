package pattern;

import java.util.*;
public class pattern14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int k=1;
		for(int i=1;i<=a;i++) {
			k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+a-j;
			}
			System.out.println();
		}
	}

}