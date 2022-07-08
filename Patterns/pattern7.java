package pattern;

import java.util.Scanner;
public class pattern7 {
	public static void main(String[] args) {
		int row=1;
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0){
				for(int j=1;j<=i;j++) {
					System.out.print(count+" ");
					count++;
				}
			}else {
				int reverse= row +count-1;
				for(int j=0;j<i;j++) {
					System.out.print(reverse -- +" ");
					count++;
				}
			}
			System.out.println();
			row++;
		}

	}
}
