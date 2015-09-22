import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] nm = line.split(",");
            Integer n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);
            while ( n >= m ) {
            	n -= m;
            }
            System.out.println(n);
        }
    }
}
