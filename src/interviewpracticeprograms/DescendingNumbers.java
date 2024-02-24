package interviewpracticeprograms;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingNumbers {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(3);

		System.out.println("Unsorted ArrayList: " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted ArrayList " + "in Descending order : " + list);
	}
}