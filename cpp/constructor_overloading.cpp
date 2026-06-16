#include<iostream>
#include<string>
using namespace std;

class car{

    public:

    string name;
    string model;
    int year;
    
car(string n){

name = n;

}

car(string a , string m){

name = a;
model = m;

}

car(string b, string s, int y){

    name = b;
    model = s;
    year = y;

}

car(){}

};

int main(){

car car1(" TOYOTA " , " Inova Crysta ");
car car2(" BMW ");
car car3(" PORSCHE " , " Taycan " ,2023);
car car4;

cout << "------- CAR LIST -------"<< endl;

    cout << car1.name<<endl;
    cout << car1.model<< endl;

    cout << "------------------------" << endl;

    cout << car2.name<< endl;

    cout << "------------------------" << endl;

    cout << car3.name<< endl;
    cout << car3.model<< endl;
    cout <<" "<< car3.year<< endl;

cout << "------- The  End -------"<< endl;


    return 0;
}