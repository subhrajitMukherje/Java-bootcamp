package pattern;

import java.util.*;
public class pattern8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        int temp = 2;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                while (!isPrime(temp))
                {
                    temp++;
                }
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num)
    {
        boolean flag = false;
        for (int k = 2; k <= num / 2; k++)
        {

            if (num % k == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
            return false;
        return true;
    }
}