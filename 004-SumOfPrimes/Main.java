import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    	Integer sumOfPrimes = 0, countOfPrimes = 0, number = 2;
    	while (countOfPrimes < 1000) {
    		if (isPrime(number)) {
                sumOfPrimes += number;
                countOfPrimes++;
			}
            number++;
    	} 

    	System.out.println(sumOfPrimes);
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
