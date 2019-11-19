/* UT01.Programacion Multiproceso */
/* Practica 4 . ejercicio 3*/


#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(int argc, char *argv[])
{
	pid_t pid1,pid2,pid3;
	int status;
	pid1 = fork();
	int i;
	
	if (pid1 == 0)/*hijo*/
	{
		
		printf("Soy el hijo 1 (%d, hijo de %d)\n",getpid(),getppid());
		
	}

	else /*de hijo1*/
	{
		pid2 = fork(); //creo hijo2

		if (pid2 == 0)/*hijo2*/
		{
		
		printf("Soy el hijo2 (%d, hijo de %d)\n",getpid(),getppid());
		
		//creo hijo 3			
		pid3 = fork(); //creo hijo3

			if (pid3 == 0)/*hijo3*/
			{
		
			printf("Soy el hijo3 (%d, hijo de %d)\n",getpid(),getppid());
		
			}
		waitpid(pid3, &status, 0); // hijo2 espera a su hijo --> hijo3
		}

		else /*de hijo2*/
		{
						
			//padre de todos 
			waitpid(pid1, &status, 0); // padre espera a hijo1
			waitpid(pid2, &status, 0); // padre espera a hijo2
			
			printf("Soy el padre (%d, hijo de %d)\n",getpid(),getppid());	
			
			
		} //else segundo hijo
		
	} //else primer hijo
	return 0;
}
