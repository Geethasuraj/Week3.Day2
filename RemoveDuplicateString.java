package week3.day2assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");

		Set<String> duplicate = new LinkedHashSet<String>();

		for (String eachword : words) {
			duplicate.add(eachword);
		}

		for (String word : duplicate) {
			System.out.println(word);
		}

	}

}
