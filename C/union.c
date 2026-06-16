#include<stdio.h>
#include<string.h>

union student{

    char name[30];
    int id;
    float result;

};

int main(){

union student student1;

printf("enter the name : ");
scanf("%s",&student1.name);

printf("Name : %s\n",student1.name);

printf("enter the id of student : ");
scanf(" %d",&student1.id);

printf("ID : %d\n", student1.id);

printf("enter the result of student : ");
scanf("%f",&student1.result);

printf("Result : %f\n", student1.result);


    return 0;

}