import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int a;
        int b;
        int c;

        StringTokenizer st;					

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");

            a = Integer.parseInt(st.nextToken());		 
            b = Integer.parseInt(st.nextToken());
            c = a + b;

            bw.write("Case #" + i + ": ");
            bw.write(a + " + " + b + " = ");
            bw.write(c + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}