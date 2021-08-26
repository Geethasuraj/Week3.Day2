package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array and add the Strings values as (Aspire systems, cts,
		// wipro, Hcl)

		List<String> list = new ArrayList<String>();
		list.add("Aspire systems");
		list.add("cts");
		list.add("wipro");
		list.add("hcl");

		// Get the length of the array
		int listSize = list.size();
		System.out.println("The length is: " + listSize);

		// sort the array
		Collections.sort(list);
		System.out.println("The sorted value is" + list);

		// Iterate it in the reverse order
		Collections.reverse(list);

		// print the array
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		System.out.println("The reverse order is : " + list);

	}

}
