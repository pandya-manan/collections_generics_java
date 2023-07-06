package array_programs;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		Integer num[]=new Integer[] {1,4,5,23,5,32,32,5,3,8,9,5,65,43,2,1,1};
		Arrays.sort(num);
		BinarySearch object=new BinarySearch();
		System.out.println(object.binarySearch(num, 5));
		

	}
	
	public int binarySearch(Integer[] num,Integer x)
	{
		int l=0,r=num.length-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(num[m]==x)
				return m;
			else if(num[m]<x)
				l=m+1;
			else
				r=m-1;
			
			
		}
		return -1;
	}

}
