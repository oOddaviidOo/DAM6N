#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/wait.h>

int main(){
int fd[2];
pid_t pid;
char mensaje[]="Hey padre\0";
char buf[100];
pipe(fd);//creo pipe
pid=fork();//creo proceso
switch(pid){
case -1: 
	printf("Error");
	exit(-1);
case 0: //hijo envia
	close (fd[0]);//cierra receptor de entrada
        //receptor, mensaje, longitud mensaje
	write (fd[1],mensaje,strlen(mensaje));//escribo en el pipe
	printf("HIjo saluda a padre. %s\n",buf);
	break;
default:
	wait(NULL); //espero proceso hijo
	close(fd[1]);//cierra descriptor de entrada
        //receptor, variable donde guardar, longitud a guardar
	read(fd[0],buf,sizeof(buf));//leo en el pipe
	printf("El padre recibe. %s\n",buf);
	break;
}
return 0;
}
