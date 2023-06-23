package generic;

import java.util.Scanner;

public class GenericSwap {
	
	public <T> void swap(T x,T y)
	{
		T temp;
		temp=x;
		x=y;
		y=temp;
	}
	
	public static void main(String args[])
	{
		GenericSwap object=new GenericSwap();
		Integer num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Integer number");
		num1=scan.nextInt();
		System.out.println("Enter the second Integer number");
		num2=scan.nextInt();
		System.out.println("The numbers before the swap are\t"+num1+"\t"+num2);
		object.swap(num1,num2);
		System.out.println("The numbers after the swap are\t"+num1+"\t"+num2);
		Float num3,num4;
		System.out.println("Enter the first Float number");
		num3=scan.nextFloat();
		System.out.println("Enter the second Float number");
		num4=scan.nextFloat();
		scan.close();
		System.out.println("The numbers before the swap are\t"+num3+"\t"+num4);
		object.swap(num3,num4);
		System.out.println("The numbers after the swap are\t"+num3+"\t"+num4);
	}
	
	

}
