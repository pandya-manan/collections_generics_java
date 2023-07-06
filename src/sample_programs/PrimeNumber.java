package sample_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Integer number,flag=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number which needs to be checked if it is a prime number or not");
		number=sc.nextInt();
		Integer m=number/2;
		sc.close();
		if(number==0 || number==1)
		{
			System.out.println(number+" is not a prime number");
		}
		else
		{
			for (int i=2;i<m;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+" is not a prime number");
					flag=-1;
					break;
				}
				else
					flag=0;
					
					
			}
		}
		if(flag!=-1)
		{
			System.out.println(number+" is a prime number");
		}

	}

}
