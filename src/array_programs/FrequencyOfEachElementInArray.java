package array_programs;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {
		int numbers[]=new int[] {1,4,6,4,1,6,7,6,8,7,8,6,3,1,2,4,5,6};
		int frequency[]=new int[numbers.length];
		int visited=-1;
		for(int i=0;i<numbers.length;i++)
		{
			Integer count=1;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
					frequency[j]=visited;
				}
			}
			if(frequency[i]!=visited)
			{
				frequency[i]=count;
			}
			
		}
		System.out.println("ELEMENT            FREQUENCY");
		for(int i=0;i<numbers.length;i++)
			if(frequency[i]!=visited)
		{
			System.out.println(numbers[i]+"                    "+frequency[i]);
		}

	}

}
