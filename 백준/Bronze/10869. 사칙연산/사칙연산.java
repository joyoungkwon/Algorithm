import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((A+B) + "\n");
        bw.write((A-B) + "\n");
        bw.write((A*B) + "\n");
        bw.write((A/B) + "\n");
        bw.write((A%B) + "\n");

        bw.flush();
        bw.close();
    }
}


