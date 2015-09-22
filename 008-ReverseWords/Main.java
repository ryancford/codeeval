import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        if ( args.length > 0 ) {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                // Process line of input Here
                String[] words = line.split("\\s");
        		for ( int n = words.length - 1; n >= 0; n-- ) {
        			System.out.print(words[n]);
                    if ( n > 0 ) System.out.print(" ");
        		}
                System.out.println();
            }
        }
    }
}
