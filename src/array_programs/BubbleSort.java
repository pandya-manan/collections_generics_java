package array_programs;

public class BubbleSort {

	public static void main(String[] args) {
		Integer num[]=new Integer[] {1,6,4,9,7,0,2,5,4,6,3,7,8,6,5,4};
		BubbleSort sort=new BubbleSort();
		sort.sort(num);
		for(Integer ele:num)
		{
			System.out.print(ele+" ");
		}

	}
	
	public void sort(Integer[] num)
	{
		int i,j,temp;
		boolean swapped;
		for(i=0;i<num.length-1;i++)
		{
			swapped=false;
			for(j=0;j<num.length-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped=false)
				break;
		}
	}

}
