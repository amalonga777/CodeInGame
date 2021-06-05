import java.io.File;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		String a = timeConversion("07:05:45PM");
	}

	/**
	 * Combinaison de n dans p
	 */
	static BigInteger combinaison(int n, int p) {
		return factorial(n).divide(factorial(p).multiply(factorial(n - p)));
	}

	public static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");

		for (int i = 2; i <= n; i++)
			f = f.multiply(BigInteger.valueOf(i));

		return f;
	}

	/**
	 * conversion isDuoDigit
	 *
	 */

	public static int isDuoDigit(int number) {

		if (number < 0) {
			number = -number;
		}
		Set<Character> h = new HashSet<Character>();

		char[] arr = new char[(int) (Math.log10(number) + 1)];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = (char) ('0' + (number % 10));
			h.add(arr[i]);
			number /= 10;
		}

		if (h.size() > 2)
			return 0;

		return 1;
	}

	/**
	 * conversion de date
	 */

	public static String timeConversion(String s) {
		Date date = null;
		String output = null;

		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");

		try {
			date = df.parse(s);

			output = outputformat.format(date);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}

		return output;
	}

	/**
	 * Locates the universe-formula​​​​​​‌​​‌​​‌​​​​​‌‌​​‌​‌‌​​‌​​ file.
	 */
	static String locateUniverseFormula() {
		File dir = new File("/tmp/documents");

		return findFile("universe-formula", dir);
	}

	static String findFile(String name, File file) {
		String chemin = null;
		File[] list = file.listFiles();
		
		if (list != null)
			for (File fil : list) {
				if (fil.isDirectory()) {
					chemin = findFile(name, fil);
				} else if (name.equalsIgnoreCase(fil.getName())) {
					chemin = fil.getPath().toString();
				}
			}

		return chemin;
	}

	/**
	 * Locates the universe-formula​​​​​​‌​​‌​​‌​​​​​‌‌​​‌​‌‌​​‌​​ file.
	 */

	public static char scanChar(String s) {
		for (char c = 'A'; c <= 'Z'; c++) {
			// use String.equals to compare strings
			if (AsciiArt.printChar(c).equals(s)) {
				return c;
			}
		}
		return '?';
	}

}
