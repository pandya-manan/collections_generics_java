package array_programs;

public class CopyAllElements {

	public static void main(String[] args) {
		Integer arrayOne[]=new Integer[] {1,4,3,2,6,5,4,3,2};
		Integer arrayTwo[]=new Integer[arrayOne.length];
		CopyAllElements copy=new CopyAllElements();
		copy.copyMethod(arrayOne, arrayTwo);
		System.out.println("Original Array");
		for(Integer ele:arrayOne)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("Copied Array");
		for(Integer ele2:arrayTwo)
		{
			System.out.print(ele2+" ");
		}
	}
	
	public void copyMethod(Integer[] arrayOne, Integer[] arrayTwo)
	{
		for(int i=0;i<arrayOne.length;i++)
		{
			arrayTwo[i]=arrayOne[i];
		}
	}
	
}
