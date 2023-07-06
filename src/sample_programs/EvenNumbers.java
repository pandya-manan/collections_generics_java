package sample_programs;

public class EvenNumbers {

	public static void main(String[] args) {
		
		EvenNumbers even=new EvenNumbers();
		even.printEvenNumbers();
		even.printOddNumbers();
	}
	
	public void printEvenNumbers()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public void printOddNumbers()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
