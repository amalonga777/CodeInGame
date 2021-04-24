import java.math.BigInteger;

public class Solution {
	
	//Combinaison de n dans p
	static BigInteger combinaison(int n, int p) {
		return factorial(n).divide(factorial(p).multiply(factorial(n-p)));
	} 
	
	 public static BigInteger factorial(int n) {
	    BigInteger f = new BigInteger("1");
	  
	    for (int i = 2; i <= n; i++) 
	    f = f.multiply(BigInteger.valueOf(i));
	    
	    return f;
	 } 
	 
	 

}
