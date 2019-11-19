/* UT01.Programacion Multiproceso */
/* Practica 4 . Ejercicio 4*/

#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char * argv[]) {
	int pid1, pid2, estado;
	int status;
	printf("Introduce opcion : 1 / 2 \n");
	int opcion;
	scanf("%d", &opcion);
	/*garantizamos hijo siempre acabe antes padre con waitpid*/
	switch(opcion){
		case 1:
			pid1 = fork();
			if (pid1 == 0)/*hijo*/
				{
				printf("Soy proceso 1 y termino\n");
				}
			
			else /*padre*/
				{
				waitpid(pid1, &status, 0); // padre espera a hijo
				printf("Soy proceso 2 y termino\n");	
				}
		

			break;
		case 2:
			pid2 = fork();
			if (pid2 == 0)/*hijo*/
				{
				printf("Soy proceso 2 y termino\n");
				}
			
			else /*padre*/
				{
				waitpid(pid2, &status, 0); // padre espera a hijo
				printf("Soy proceso 1 y termino\n");	
				}	
			break;

		default:
			printf("Opción no válida\n");
			break;
	}
				



  

   
      
}
