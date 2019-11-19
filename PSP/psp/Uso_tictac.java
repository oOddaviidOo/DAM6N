public class Uso_tictac  {
//Metodo main
	public static void main (String[] args){
		 HiloTic tic=null;
		 HiloTac tac=null;
		 
	 tic= new HiloTic(); //creo hilo tic
	 tac= new HiloTac(); //creo hilo tac
	 
	 tic.setName ("HILO_tic"  ); // establezo nombre
	 tic.start();
	 
	 tac.setName ("HILO_tac"  ); // establezo nombre
	 tac.start();
	 
	 System.out.println ("Hilo tic e hilo tac creados...");
	  }
}