#include <stdio.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <fcntl.h>
#define TAM_BUF 80
#define TRUE 1

int main(void){
int fp;
char buf[TAM_BUF];  
int nb;
mknod("FIFO1",S_IFIFO|0660,0);
while(TRUE)    
{
fp=open("FIFO1",O_RDONLY);      
nb=read(fp,buf,TAM_BUF-1);      
buf[nb]='\0';      
printf("Cadena recibida: %s \n",buf);      
close(fp);    
}  
return 0;}
