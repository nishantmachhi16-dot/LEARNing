#include<iostream>
#include<string>
using namespace std;

class stud{
public:
    int id;
    float marks;

void study(){

cout << "students is studied and got "<< marks<<endl;

}

stud(int i,float m){

    id = i;
    marks = m;

}

stud(const stud &s){

    id = s.id;
    marks= s.marks;

}

};

int main(){

    stud stud1(1,100);
    stud stud2 = stud1;

    cout <<"id :"<<stud1.id<<endl;
    cout <<"marks :"<<stud1.marks<<endl;
    cout <<"id :"<<stud2.id<<endl;
    cout <<"marks :"<<stud2.marks<<endl;


    stud1.study();
    stud2.study();

    return 0;
}