package week3.day2assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "PayPal India";
		// Convert it into a character array
		char[] ch = arr.toCharArray();

		// Declare a Set as charSet for Character

		Set<Character> charSet = new LinkedHashSet<Character>();

		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupcharSet = new LinkedHashSet<Character>();

		// Iterate character array and add it into charSet

		for (int i = 0; i < ch.length - 1; i++) {

			// If the character is already in the charSet then, add it to the dupCharSet
			if (charSet.contains(ch[i])) {
				dupcharSet.add(ch[i]);
			} else {
				charSet.add(ch[i]);
			}
		}
		// Check the dupCharSet elements and remove those in the charSet
		charSet.remove(' ');
		System.out.println("charset" + charSet);
		System.out.println("dupcharset" + dupcharSet);

	}

}
