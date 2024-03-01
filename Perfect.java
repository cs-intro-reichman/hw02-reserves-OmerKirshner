/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int i = 2;
		int total = 1;
		String number = x + " is a perfect number since " + x +" = 1";
		while (i < x) {
			if (x % i == 0) {
			number = number + " + " + i;
			total += i;
			}
			i++;
		}
		if (x == total) {
			System.out.println(number);
		}
		else {
			System.out.print(x + " is not a perfect number");
		}
	}
}
