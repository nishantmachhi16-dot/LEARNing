#include<iostream>
#include<string>
using namespace std;

 
int main(){


    int num1,num2;


cout << "enter first value :" << endl;
cin>> num1;

cout << "enter second value :" << endl;
cin>> num2;

cout << " arithmatic oprators : " << endl;

cout << "sum is: " <<num1 + num2 << endl;
cout << "subtraction is : " << num1 - num2<< endl;
cout << "multiplication is : " << num1 * num2<< endl;
cout << " division is : " << num1 / num2<< endl;
cout << " modulus is : " << num1 % num2<< endl;

cout << " Assingment oprators : " << endl


cout<< " subtration is : "<<num1-=2<<endl;
cout<< " multiplication is : "<<num1*=2<<endl;
cout<< " division is : "<<num1/=2<<endl;
cout<< " power is : "<<num1^=2<<endl;
cout<< " modulus is : "<<num1%=2<<endl;

return 0;
}