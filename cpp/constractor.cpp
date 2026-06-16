#include<iostream>
#include<string>
using namespace std;


class student{
    public:

string name;
int id;
float cgpa;

student(string n , int i , float c){

    name = n;
    id = i;
    cgpa = c;

    
}

};

int main(){

student student1( "Nia ", 1 , 9.5);
student student2( "Nidhi " , 2, 9.4);

cout<<" --- Student List ---  "<<endl;

cout<<"NAME : "<<student1.name<<endl;
cout<<"ID : "<<student1.id<<endl;
cout<<"CGPA : "<<student1.cgpa<<endl;

cout << "---------------------"<<endl;

cout<<"NAME : " << student2.name<<endl;
cout<<"ID : "<<student2.id<<endl;
cout<<"CGPA : "<<student2.cgpa<<endl;

cout << "-----  The End  -----"<<endl;

    return 0;
}