import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

	public static void main(String[] args) {
		String a = timeConversion("07:05:45PM");
	}

	// Combinaison de n dans p
	static BigInteger combinaison(int n, int p) {
		return factorial(n).divide(factorial(p).multiply(factorial(n - p)));
	}

	public static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");

		for (int i = 2; i <= n; i++)
			f = f.multiply(BigInteger.valueOf(i));

		return f;
	}

	// conversion de date

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

	

}
