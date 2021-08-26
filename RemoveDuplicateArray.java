package week3.day2assignment;

import java.util.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(Arrays.asList(arr));
		System.out.println(set);

	}

}
