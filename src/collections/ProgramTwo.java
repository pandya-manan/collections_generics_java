package collections;

import java.util.LinkedList;
import java.util.List;
//This program demonstrates the list of integers being implemented by the linked list class
public class ProgramTwo {

	public static void main(String[] args) {
		List<Integer> numbers=new LinkedList<Integer>();
		
		//Using add() function to add the numbers to the end of the linked list implementation
		numbers.add(45);
		numbers.add(56);
		numbers.add(76);
		numbers.add(84);
		numbers.add(42);
		
		System.out.println(numbers.toString());
		
		//Using the add(index,element) function to add an element at the specified index
		numbers.add(2, 102);
		
		System.out.println(numbers.toString());
		
		List<Integer> numbersTwo=new LinkedList<Integer>();
		numbersTwo.add(4);
		numbersTwo.add(5);
		numbersTwo.add(3);
		
		//Using the addAll(Collection c) method to add a secondary collection to the main list 'numbers' , at the end of the list 'numbers'
		numbers.addAll(numbersTwo);
		
		System.out.println(numbers.toString());
		
		List<Integer> numbersThree=new LinkedList<Integer>();
		numbersThree.add(30);
		numbersThree.add(32);
		numbersThree.add(34);
		
		//Using the addAll(index,collection c) method to add a new list to the main list 'numbers' at the given index
		numbers.addAll(2, numbersThree);
		
		System.out.println(numbers.toString());
		
		//Using get(index) method to get the value at the specified index
		System.out.println(numbers.get(4));
		
		//Using the indexOf(element) to get the index value of the given element stored in the list
		System.out.println(numbers.indexOf(32));
		
		//Using the remove(index) to remove the particular element by giving the index value
		numbers.remove(2);
		
		System.out.println(numbers.toString());
		
		numbers.stream().forEach(num->System.out.print(num+" "));
		

	}

}
