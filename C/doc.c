#include<stdio.h>

int main(){

FILE *pWORD = fopen("C:\\Users\\admin\\c_to_word","w");

char abtu[30]= "you are a gay";

if ( pWORD == NULL){

printf("file not found...\ntry again...");

return 1;

}

fprintf(pWORD,"%s",abtu);

fclose(pWORD);

printf("data written successfully...");

    return 0;
}