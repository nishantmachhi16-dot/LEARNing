#include <stdio.h>
void s();
int cube();
int raised_to_four(int);
int raised_to_five(int);

int num1, result, num2,num3;
void s()
{
    printf("No arg No return\n");

    result = num1 * num1;
    printf("square of given numbers :%d\n", result);
}

int cube()
{

    printf("No Args with return\n");

    result = num1 * num1 * num1;
    return result;
};

int raised_to_four(int num2)
{

    printf("with arg no return\n");

    printf("enter a number two :");
    scanf("%d", &num2);

    result = num2 * num2 * num2 * num2;
    printf("\nhere is your four times a value : %d\n", result);
};

int raised_to_five(int num3){

printf(" with arg with return\n ");

printf("enter a number three :");
scanf("%d", &num3);

result = num3 * num3 * num3 * num3;

return result;

};

int main()
{
    int final , semifinal; 
    printf("enter a number :");
    scanf("%d", &num1);

    s();

    final = cube();
    printf(" \nhere is your cube :%d \n", final);

    raised_to_four(12);

    semifinal= raised_to_five(20);
    printf("\nhere is your raised to five of your num three : %d \n",semifinal);

    return 0;
}
