package sample_programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Integer a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Enter the third number");
		c=sc.nextInt();
		sc.close();
		Integer temp=a>b?a:b;
		Integer result=c>temp?c:temp;
		System.out.println("The largest of the three numbers "+a+" "+b+" "+c+" is "+result);

	}

}
