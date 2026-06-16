#include<stdio.h>
#include<string.h>

int  main(){

FILE *pfew = fopen("pppnew.c","w");

if(    pfew == NULL  ){

printf("\tNo file founded....\n\tTry again with the valid name....");

return 1;
}

fprintf(pfew,"#include<stdio.h>\nint main(){\nprintf(\"hello idiots\");\nreturn 0;\n}");


fclose(pfew);

printf("data written successfully...");


    return 0;
}