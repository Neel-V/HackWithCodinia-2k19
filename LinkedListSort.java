import java.util.*;

public class LinkedListSort {

	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Dhruv");
		list.add("Anshul");
		list.add("Chander");

		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}		
