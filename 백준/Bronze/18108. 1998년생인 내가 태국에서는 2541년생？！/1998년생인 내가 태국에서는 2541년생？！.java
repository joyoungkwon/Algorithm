import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
       int fixed = 543;
       int result = s.nextInt();

        System.out.println(( result-fixed));
    }
}


