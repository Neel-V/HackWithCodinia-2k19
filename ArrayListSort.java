import java.util.*;

public class ArrayListSort {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Dhruv");
		list.add("Anshul");
		list.add("Chander");

		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
		
		
