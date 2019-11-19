#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>

int main(){
int fp;  
char cont[90];  
fp=open("FIFO1",1);
if (fp==-1){
printf ("Error al abrir el archivo\n");
exit(1);}
printf ("Introduce un mensaje: ");
scanf ("%s",cont);
printf ("mandando información al fifo...\n");
write (fp,cont,strlen(cont));
close(fp);
return 0;}
