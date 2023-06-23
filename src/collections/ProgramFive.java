package collections;

import java.util.LinkedList;
import java.util.Queue;
//This Program demonstrates the Queue which follows the FIFO order
public class ProgramFive {

	public static void main(String[] args) {
		Queue<Integer> numbers=new LinkedList<Integer>();
		//using add(element) to add individual elements to the queue

		numbers.add(45);
		numbers.add(67);
		numbers.add(89);
		numbers.add(99);
		numbers.add(1001);
		
		System.out.println(numbers.toString());
		
		//Using peek() function, we can check which element will be out first using the remove() function
		System.out.println(numbers.peek());
		
		//The remove() function will remove the elements from the queue in FIFO Order
		numbers.remove();
		
		System.out.println(numbers.toString());
		
		//Using stream() API to print out the elements in the order
		numbers.stream().forEachOrdered(num->System.out.println(num));
		
		//poll() method will poll the queue's head element and if the queue is empty it will return null 
		numbers.poll();
		
		System.out.println(numbers.toString());
		
	}

}
