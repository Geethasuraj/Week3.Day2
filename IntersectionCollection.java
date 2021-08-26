package week3.day2assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 3, 2, 11, 4, 6, 7 };
		Integer[] arr1 = { 1, 2, 8, 4, 9, 7 };

		Set<Integer> set = new HashSet<Integer>();

		set.addAll(Arrays.asList(arr));
		set.retainAll(Arrays.asList(arr1));

		System.out.println(set);

	}

}