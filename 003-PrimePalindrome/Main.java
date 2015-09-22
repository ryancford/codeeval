import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    	Integer highestPrimePalindrome = 0;
    	for (int i = 0; i < 1000; i++) {
    		if (isPrime(i)) {
    			String intStr = Integer.toString(i);
    			if (intStr.equalsIgnoreCase(new StringBuilder(intStr).reverse().toString())) {
	    			highestPrimePalindrome = i;
	    		}
			}
    	}
    	System.out.println(highestPrimePalindrome);
    }

    private static Boolean isPrime(Integer i) {
	    for (int n = 2; n < i; n++) {
			if ( i % n == 0 ) {
				return false;
			}
		}

		return true;
    }
}
