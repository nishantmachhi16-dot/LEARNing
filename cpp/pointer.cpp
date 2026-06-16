#include<iostream>
using namespace std;

int main(){
    int num =10;
    int *ptr = &num;

    cout<<"address :" <<&num<<endl;
    cout<<"value :" <<num<<endl;
    cout<<"address :" <<ptr<<endl;
    cout<<"value :" <<*ptr<<endl;

    return 0;
}