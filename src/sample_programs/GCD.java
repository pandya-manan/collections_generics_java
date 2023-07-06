package sample_programs;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Integer num1,num2,gcd=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number ");
		num1=sc.nextInt();
		System.out.println("Enter the second number ");
		num2=sc.nextInt();
		sc.close();
		for(i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("The gcd of the two numbers "+num1+" "+num2+" is "+gcd);
		

	}

}
