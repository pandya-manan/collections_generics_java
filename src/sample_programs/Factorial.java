package sample_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Integer number,prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		sc.close();
		for(int i=1;i<=number;i++)
		{
			prod=prod*i;
		}
		System.out.println("The factorial of the number "+number+" is "+prod);

	}

}
