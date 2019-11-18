#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

int main(int argc, char *argv[]){
    pid_t pid1, pid2;
    int estado1, estado2;
    if ( (pid1=fork()) == 0 )
        { if ((pid2=fork()) == 0){
                 printf("Soy el nieto (%d, hijo de %d)\n", getpid(), getppid());
                } else {
                wait(&estado2);
                printf("Soy el padre(%d, hijo de %d)\n", getpid(), getppid());
            }                  
        } else {
            wait(&estado1);
            printf("Soy el abuelo (%d, hijo de %d)\n",getpid(), getppid());
        }
return 0;
}
