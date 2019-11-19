import java.io.*;
public class Ejemplo_6
{
	public static void main(String[] args) 
	{
		Runtime r=Runtime.getRuntime(); //objeto runtime
		String comando="java EjemploLectura"; //comando a ejecutar y params
		Process p=null; 

		try 
		{
			p=r.exec(comando);

		
			OutputStream os=p.getOutputStream();
			os.write("Hola psp\n".getBytes());
			os.flush(); //vacio buffer

			InputStream is=p.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader (is));
			String linea;
			//leo linea a linea e imprimio en el fichero
			while ((linea=br.readLine())!=null)//lee una linea
			{
				System.out.println(linea);
			}//fin bucle lineas
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		//comprobación de error 0 bien - 1 mal
		int exitVal;
		try 
		{
			exitVal=p.waitFor();
			System.out.println("Valor de salida "+exitVal);
		} 
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}//fin main
}//fin Ejemplo3
