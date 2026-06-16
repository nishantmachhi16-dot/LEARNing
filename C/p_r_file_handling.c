#include<stdio.h>
#include<conio.h>

int main(){

    FILE *pREAD = fopen("p_w_file_handling.c","r");
    char buffer[1024]={0};

    if (pREAD == NULL)
    {
        /* code */
        printf("file not found...\ntry again latter...");
        return 1;

    }
    
    while (fgets(buffer,sizeof(buffer),pREAD) != NULL)
    {
        
        printf("%s",buffer);

    }
    


fclose(pREAD);

    return 0;

}