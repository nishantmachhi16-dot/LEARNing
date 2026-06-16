#include<iostream>
#include<string>
using namespace std;

void meet(string greet = "good morning"){

cout<<"hello sir "<<greet<<endl;

}



int main(){

    meet();
    meet("good evening");

    return 0;
}