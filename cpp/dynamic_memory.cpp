#include<iostream>
using namespace std;


int main(){

    int *n = new int;
    *n=50;

    cout << "value : "<< *n<<endl;

    delete n;

return 0;

}