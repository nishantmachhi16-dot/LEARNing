#include<stdio.h>

void eo(int);

int main()
{
int a;

printf("enter a num");
scanf("%d",&a);



eo(a);

}

void eo(int a)
{

if(a%2==0)
{
printf("%d is even",a);
}
else
{
printf("%d is odd",a);
}


}