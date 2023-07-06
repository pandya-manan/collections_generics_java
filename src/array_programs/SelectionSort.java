package array_programs;

public class SelectionSort {

	public static void main(String[] args) {
		Integer numbers[]=new Integer[] {4,3,9,8,15,13,17,14,12};
		SelectionSort sortingObject=new SelectionSort();
		sortingObject.sort(numbers);
		for(Integer ele:numbers)
		{
			System.out.print(ele+" ");
		}

	}
	
	public void sort(Integer[] num)
	{
		int n=num.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(num[j]<num[min])
					min=j;
			}
			if(min!=i)
			{
				int temp=num[min];
				num[min]=num[i];
				num[i]=temp;
				
			}
		}
	}

}
