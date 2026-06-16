#include<iostream>
using namespace std;


   void empp(string name ,int id, double salary){

cout << "name : "<<name<<endl;
cout << "id : "<<id<<endl;
cout << "salary : "<<salary<<endl;

    }

   void empp(string name , double salary){

cout << "name : "<<name<<endl;        cout << "salary : "<<salary<<endl;

    }

   void empp(string name ,int id){

        cout << "name : "<<name<<endl;
        cout << "id : "<<id<<endl;

    }
    



int main(){



empp("nia",1,245666.6);



return 0;
}