#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>
#include <stdlib.h>

void main(){
 int var=6;
 int vh=0;
 int vp=0;
 pid_t pid;
 pid=fork();
 printf("Valor inicial de la variable: %d ", var);
 if(pid==-1){
   printf("No se ha creado el proceso hijo");
   _exit-1;
 }
 if(pid==0){
   vh=var-5;
   printf("Variable en proceso hijo: %d  %d , %d", vh,getpid(),getppid());
 }else{
   vp=var+5;
   printf("Variable en proceso padre:%d  %d , %d y pid tuyo %d", vp,getpid(),getppid(),pid);
 }
 exit(0);
}

