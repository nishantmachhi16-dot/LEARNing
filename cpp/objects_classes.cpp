#include<iostream>
#include<string>
using namespace std;

class human{
    public:
        string name;
        int age;
        string occupation;

        void eat(){

            cout<<"a person can eat"<<endl;
        }

        void sleep(){

            cout<<"a human can sleep"<< endl;

        }

        void work(){

            cout<<"a human can work"<< endl;

        }

};


int main(){

human human1;

cout<< "enter a name :";
cin>> human1.name;
'\n';
cout<< "enter a age :";
cin>> human1.age;
'\n';
cout<< "enter a occupation :";
cin>> human1.occupation;
'\n';

cout<<"here is your entered name :"<< human1.name<<endl;
cout<<"here is your entered age :"<< human1.age<<endl;
cout<<"here is your entered occupation :"<< human1.occupation<<endl;


human1.eat();
human1.sleep();
human1.work();



    return 0;
}