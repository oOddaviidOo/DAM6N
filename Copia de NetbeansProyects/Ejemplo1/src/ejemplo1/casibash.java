/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;


public class casibash{
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
    Scanner t=new Scanner(System.in);
    System.out.println("Introduce comando");
	String 
comando=t.next();
	Process p;

	try{
		p=r.exec(comando);
		} catch(Exception e) {
			System.out.println ("Error en "+comando);
			e.printStackTrace();
			}
	}

}//Ejemplo1
