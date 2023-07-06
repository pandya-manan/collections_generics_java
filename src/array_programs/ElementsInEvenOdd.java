package array_programs;

public class ElementsInEvenOdd {

	public static void main(String[] args) {
		int numbers[]=new int[] {1,5,3,3,4,5,2,1,87,5,3,6,32,1,34};
		ElementsInEvenOdd obj=new ElementsInEvenOdd();
		obj.printEvenPlacesNumbers(numbers);
		System.out.println();
		obj.printOddPlacesNumbers(numbers);
		System.out.println();
		System.out.println("The largest element in the array is "+obj.largestElement(numbers));
		System.out.println("The smallest element in the array is "+obj.smallestElement(numbers));
		System.out.println("The number of elements in the array is "+obj.numberOfElementsInArray(numbers));
		
		
	}
	
	public void printEvenPlacesNumbers(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(num[i]+" ");
			}
		}
	}
	public void printOddPlacesNumbers(int[] num)
	{
		for(int j=0;j<num.length;j++)
		{
			if(j%2!=0)
			{
				System.out.print(num[j]+" ");
			}
		}
	}
	
	public int largestElement(int[] num)
	{
		int large=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(large<num[i])
			{
				large=num[i];
			}
		}
		return large;
	}
	
	public int smallestElement(int[] num)
	{
		int small=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(small>num[i])
			{
				small=num[i];
			}
		}
		return small;
	}
	
	public int numberOfElementsInArray(int[] num)
	{
		int number=0;
		for(int i=0;i<num.length;i++)
		{
			number+=1;
		}
		return number;
	}

}
