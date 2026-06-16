#include<stdio.h>
#include<string.h>


void arr_func(int arr[][3], int size) {
    for(int i = 0; i < size; i++) {
        for (int j = 0; j < 3; j++) {
         
        printf("%d ", arr[i][j]);    

        }
        printf("\n");
    }
}


int main(){
 
    int arr[2][3]={ {1,2,3},{4,5,6}  };

    arr_func(arr, 2);

    return 0;
}