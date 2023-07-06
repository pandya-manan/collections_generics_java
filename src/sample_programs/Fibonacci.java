package sample_programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Integer n1=0,n2=1,i,count,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of terms needed in the Fibonacci Series to be displayed");
		count=sc.nextInt();
		sc.close();
		System.out.print(n1+" "+n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}

	}

}
