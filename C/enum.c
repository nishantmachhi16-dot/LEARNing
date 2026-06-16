#include<stdio.h>
#include<conio.h>
#include<string.h>


enum rating{

    free,
    worst,
    notgood,
    good,
    best,
    amazing

};

int main(){

    enum rating trating1;

    trating1 = good;

    printf("ratings in star :%d",trating1);

    return 0;
}