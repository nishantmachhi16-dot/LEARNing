#include <iostream>
using namespace std;

class speed{
    public:

    void speeds(){

        cout << "cars runs faster " <<endl;

    }
};

class aspeed : public speed{
public:
    void actual_s(){

        cout << "car is running at 120kmph"<<endl;

}

};

int main(){

aspeed as1;

as1.actual_s();
as1.speeds();

    return 0;
}