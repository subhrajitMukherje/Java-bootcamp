package pattern;

import java.util.Scanner;
public class pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int x=0;
			int y=1;
			System.out.print(y+" ");
			for(int j=0;j<i;j++) {
				int z=x+y;
				System.out.print(z+" ");
				x=y;
				y=z;
			}
			System.out.println();
		}
	}

}