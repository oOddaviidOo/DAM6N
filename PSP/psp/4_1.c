/* UT01.Programacion Multiproceso */
/* Practica 4. ejercicio1 */


#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

int main(int argc, char *argv[])
{
	pid_t pid;
	int status;
	pid = fork();
	int i;
	
	if (pid == 0)/*hijo*/
	{
		for(i=1;i<=10;i++){
			printf("Soy el hijo (%d, hijo de %d)\n",getpid(),getppid());
		}
	}
	else/*padre*/
	{
		waitpid(pid, &status, 0); // padre espera a hijo
		
		for(i=1;i<=10;i++){ 
			printf("Soy el padre (%d, hijo de %d)\n",getpid(),getppid());	
		}
		
	}
	return 0;
}

