import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
       for ( int n = 1; n <= 99; n++ ) {
            if ( n % 2 != 0 ) {
                System.out.println(n);
            }
        }
    }
}
