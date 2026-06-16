#include<iostream>
using namespace std;


class stud{

    private:
    
    float marks;


public :

void setmarks(int){

    marks = 20;
}

int getmarks(){

return marks;
}

};


int main(){

stud s1;

s1.setmarks(100);

cout<<"marks :"<<s1.getmarks()<<endl;;

return 0;
}