package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//This Program demonstrates the usage of the HashSet of Integers.
/*
 * Sets have elements stored in unordered manner
 */
public class ProgramFour {

	public static void main(String[] args) {
		Set<Integer> numbers=new HashSet<Integer>();
		//Using add() function to add the elements into the set
		numbers.add(5);
		numbers.add(9);
		numbers.add(10);
		numbers.add(111);
		
		System.out.println(numbers.toString());
		
		Set<Integer> numbersTwo=new HashSet<Integer>();
		numbersTwo.add(90);
		numbersTwo.add(135);
		numbersTwo.add(167);
		
		//Using addAll(Collection c) to add another type of collection to the main collection 'numbers'
		numbers.addAll(numbersTwo);
		
		System.out.println(numbers.toString());
		
		//Using contains(element) method to check if the particular element exists in the set, returns true or false
		System.out.println(numbers.contains(90));
		
		//Using Stream API to print out the values of the set 
		numbers.stream().forEach(num->System.out.print(num+" "));
		
		System.out.println();
		
		//Using Iterator to iterate through the set of integers
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Using remove(element) function to remove the particular element from the set
		numbers.remove(111);
		
		System.out.println(numbers.toString());
		
		
		
	}

}
