#include <stdio.h>

int main()
{

int id[10];

for(int i = 0; i<10; i++)
{
printf("enter array value %d : ",i+1);
scanf("%d",&id[i]);
}


for(int i =0; i<10; i++)
{

printf("\nhere is your num %d %d\n",i+1,id[i]);

}
    return 0;
}
