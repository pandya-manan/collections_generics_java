package generic;

public class VarargsOne {
	
	public <T> void printElements(T v[])
	{
		System.out.println("The size of the generic array sent here is: "+v.length);
		for(T t:v)
		{
			System.out.print(t+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		VarargsOne object=new VarargsOne();
		Integer numbers[]= {1,3,5,7,9};
		Integer numbersTwo[]= {2,4,6,8,10,12};
		object.printElements(numbers);
		object.printElements(numbersTwo);
		Float numbersThree[]= {1.1f,2.2f,3.3f};
		object.printElements(numbersThree);
		
	}

}
