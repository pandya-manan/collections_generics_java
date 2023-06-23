package collections;

import java.util.Stack;
//This program demonstrates the implementation of the stack of numbers
public class ProgramThree {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<Integer>();
		
		//Using the push(element) to push the element into the stack
		numbers.push(34);
		numbers.push(35);
		numbers.push(61);
		numbers.push(87);
		
		System.out.println(numbers.toString());
		
		System.out.println(numbers.peek());
		
		System.out.println(numbers.pop());
		
		System.out.println(numbers.toString());
		
		//Using the remove() method to remove the element
		numbers.remove(1);
		
		//Using the add(index,element) to add the element at the specified index of the stack 'numbers'
		numbers.add(1, 57);
		
		numbers.add(2,59);
		
		//Using the stream() method and the for each method to print out the values of the numbers in the stack 
		numbers.stream().forEach(num->System.out.print(num+" "));
		
		System.out.println();
		
		System.out.println(numbers.peek());

		//Using the size() method to print out the size of the stack
		System.out.println(numbers.size());
		
	}

}
