package sample_programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Integer number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked for armstrong number");
		number=sc.nextInt();
		Integer number2=number;
		sc.close();
		while(number2>0)
		{
			Integer dig=number2%10;
			sum=sum+(dig*dig*dig);
			number2=number2/10;
		}
		
		if(sum.equals(number))
		{
			System.out.println("The number "+number+" is an Armstrong number");
		}
		else
		{
			System.out.println("The number "+number+" is not an Armstrong number");
		}

	}

}
