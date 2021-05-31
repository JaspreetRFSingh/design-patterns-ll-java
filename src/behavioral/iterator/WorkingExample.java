package behavioral.iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkingExample {

	public static void main(String[] args) {
		Integer [] arr = {3,4,2,1,3,53,2,2,5,87,5,6,5,3,79,4};
		List<Integer> arrList = Arrays.asList(arr);
		Iterator<Integer> it = arrList.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n--------------------");
		Set<Integer> students  = new HashSet<Integer>(arrList);
		it=students.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
