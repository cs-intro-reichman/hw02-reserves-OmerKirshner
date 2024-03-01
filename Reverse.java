/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String original = args [0];
		String reverse = "";
		int i = original.length();
		char middle = original.charAt((i - 1) / 2);
		while (i >= 1) {
			char c = original.charAt(i-1); {
			reverse = reverse + c;
		}
		i--;
		}	
		System.out.println(reverse);
		System.out.println("The middle character is " + middle);
	}
}
