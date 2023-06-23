package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//This program demonstrates the usage of Map Interface
public class ProgramSix {

	public static void main(String[] args) {
		Map<Integer,String> info=new HashMap<Integer,String>();
		
		//Using put(key,value) method to put in the key and value elements into the map
		info.put(1, "Ashwin R");
		info.put(2, "Balram");
		info.put(3,"Chandini");
		info.put(4, "Darshan Jain");
		
		System.out.println(info.toString());
		
		/*Using the Map.Entry to map out each element and also using entrySet() to create the set of the map elements
		 * Thereby using the getKey() and getValue() method to get the key and value.
		 */
		for(Map.Entry<Integer,String> ele:info.entrySet())
		{
			System.out.println(ele.getKey()+" "+ele.getValue());
		}

		//Using the values() function, we store the values of the map into the Collection class type object.
		Collection<String> listOfValues=info.values();
		
		//Using the stream() api to print out each of the values stored in the Collection
		listOfValues.stream().forEach(val->System.out.println(val));
		
		//Using the remove() method by passing the key value to remove the particular map element from the map.
		info.remove(2);
		
		System.out.println(info.toString());
		
		//Prints out the size of the map
		System.out.println(info.size());
	}

}
