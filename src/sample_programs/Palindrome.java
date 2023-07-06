package sample_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Integer num,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it's a palindrome number");
		num=sc.nextInt();
		sc.close();
		Integer num2=num;
		while(num2>0)
		{
			Integer dig=num2%10;
			reverse=(reverse*10)+dig;
			num2=num2/10;
		}
		if(reverse==num)
		{
			System.out.println("The number "+num+" is a palindrome number");
		}
		else
		{
			System.out.println("The number "+num+" is not a palindrome number");
		}

	}

}
