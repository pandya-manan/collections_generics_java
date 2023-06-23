package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramOne{
	
	public static void main(String[] args)
	{
		List<Integer> numbers=new ArrayList<Integer>();
		//Adding elements into the numbers list using add() function which adds elements at the end
		numbers.add(5);
		numbers.add(6);
		numbers.add(4);
		numbers.add(3);
		
		//Printing out the list of the numbers
		System.out.println(numbers.toString());
		
		//Adding the particular element at a particular index using add() function
		numbers.add(3, 10);
		
		System.out.println(numbers.toString());
		
		List<Integer> numbersTwo=new ArrayList<Integer>();
		numbersTwo.add(11);
		numbersTwo.add(16);
		numbersTwo.add(17);
		
		//Using addAll() function to add the secondary list at the end of the first list 'numbers'
		numbers.addAll(numbersTwo);
		
		System.out.println(numbers.toString());
		
		List<Integer> numbersThree=new ArrayList<Integer>();
		numbersThree.add(27);
		numbersThree.add(34);
		numbersThree.add(78);
		
		//Using addAll(index,collection) method to add a tertiary list at the specified index value of the original list 'numbers'
		numbers.addAll(5, numbersThree);
		
		System.out.println(numbers.toString());

		//Using the contains() method to check if the value is present in the list or not.
		if(numbers.contains(27))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		//using get() function to display the particular element at the particular index number
		System.out.println(numbers.get(4));
		
		//using the indexOf() function to display the index number of the element in the list
		System.out.println(numbers.indexOf(78));
		
		//using remove() to remove element by index number
		numbers.remove(1);
		

		
		System.out.println(numbers.toString());
		
		//Making a list of numbersToDelete using Arrays.asList() method
		List<Integer> numbersToDelete=Arrays.asList(27,34,78);
		
		//Using the removeAll() function to remove a collection of numbersToDelete from the original list 'numbers'
		numbers.removeAll(numbersToDelete);
		
		System.out.println(numbers.toString());
		
		//Replaces the element by giving the index number and the value
		numbers.set(5, 67);
		
		System.out.println(numbers.toString());
		
		//Using the stream and forEach method, to display the numbers in the list
		numbers.stream().forEach(n->System.out.println(n));
		
		//Using the size() method, we can get the size of the list
		System.out.println(numbers.size());
		
		
		
}

}
