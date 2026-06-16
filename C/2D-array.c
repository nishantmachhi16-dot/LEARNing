#include<stdio.h>
#include<string.h>

int main(){
    int i = 0;
    int j = 0;
    int arr_int[2][3]={{12,21,43},{34,32,5}};

for(i=0 ; i<=2 ; i++){

    for(j=0; j<=3;  j++){

        printf("array [%d][%d] = %d\n" , i,j,arr_int[i][j] );
    }

}

    return 0;

}