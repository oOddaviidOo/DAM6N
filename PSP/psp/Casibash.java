import java.io.*;
import java.util.*;

public class Casibash {

    public static void main(String[] args) {
        
        try (
            Scanner stdin = new Scanner(System.in);                
            ) {
            String comando = "";
            System.out.println("Introduce el comando:");
            comando = stdin.nextLine();
            Runtime r = Runtime.getRuntime();
            Process p;
            p = r.exec("CMD /C " + comando);
            try (
                InputStream is = p.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                ){
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                int exitVal;
                exitVal = p.waitFor();
                System.out.println("Valor de salida " + exitVal);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}