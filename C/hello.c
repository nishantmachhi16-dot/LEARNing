#include <stdio.h>

struct employee{

    char name[30];
    int id;
    float salary;
    char dept[30];

};

int main()
{

    struct employee employee1;

    printf("enter a name :"); 
    fgets(employee1.name,30,stdin);

    printf("enter a department :");
    fgets(employee1.dept,30,stdin);

    printf("enter your salary :");
    scanf("%f",&employee1.salary);

    printf("enter your id :");
    scanf("%d",&employee1.id);

    printf("here is your name : %s \n",employee1.name);

    printf("here is your id : %d \n",employee1.id);

    printf("here is your department : %s \n",employee1.dept);

    printf("here is your salary : %f \n",employee1.salary);

    return 0;
}