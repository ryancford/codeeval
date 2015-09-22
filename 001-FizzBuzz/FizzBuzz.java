import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        if ( args != null && args.length > 0 ) {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                // Process line of input Here
                String[] values = line.split("\\s");
                Integer fizz = Integer.parseInt(values[0]);
                Integer buzz = Integer.parseInt(values[1]);
                Integer count = Integer.parseInt(values[2]);
                for ( Integer n = 1; n <= count; n++ ) {
                    String mFizz = "F", mBuzz = "B";
                    Boolean isDivisibleBy3 = n % fizz == 0;
                    Boolean isDivisibleBy5 = n % buzz == 0;
                    
                    if ( isDivisibleBy3 && isDivisibleBy5 ) {
                        System.out.print(mFizz + mBuzz);
                    } else if ( isDivisibleBy3 ) {
                        System.out.print(mFizz);
                    } else if ( isDivisibleBy5 ) {
                        System.out.print(mBuzz);
                    } else {
                        System.out.print(n);
                    }

                    if ( n < count ) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
