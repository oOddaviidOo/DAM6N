
import java.io.*;
import java.util.*;

public class Tasklist {

    public static void main(String[] args) {
       // String comando = "CMD /C tasklist /v"; //Windows
	  String comando = "ps"; //Linux
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec(comando);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                FileOutputStream fos = new FileOutputStream("procesos.txt");
                PrintWriter pw = new PrintWriter(fos);
                InputStream is = p.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));) {

            String linea;
            while ((linea = br.readLine()) != null) {
                pw.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
