#include <stdio.h>

int main()
{

int a,b,c,d,e,result;


printf("enter a numsss :");
scanf("%d %d %d %d %d ",&a,&b,&c,&d,&e);

result=(a+b+c+d+e)/(5);


if(result>=81 && result<=100)
{

    printf("grade A");

}
else if(result>=61 && result<=80)
{

    printf("grade B");

}
else if(result>=41 && result<=60)
{

    printf(" grade C");

}
else if(result>=31 && result<=40)
{

    printf(" grade D ");

}
else
{

    printf(" you are fail");

}

return 0;
}