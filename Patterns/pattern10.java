package pattern;

import java.util.*;
public class pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(j+" ");
			}
			for(int k=n-i;k<n;k++) {
				System.out.print(5+" ");
			}
			System.out.println();
		}

	}

}