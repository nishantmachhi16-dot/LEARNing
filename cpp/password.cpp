    #include<iostream>
    #include<string>
    using namespace std;

    int main(){

    string ps = "Yes", ps2= "yes" , ps3 ="YES";
    string input;

    cout<<"do you love me..? \n reply :";
    cin>>input;

    while (input != ps && input && ps2 && input != ps3)
    {
    cout<<" nooooooooo dont say that think and then reply again " << endl;

    cout<<"i hope you thought wsiely"<<endl;
    
    cin>>input;
    }

    cout<< "i knew it from the beginning you'll say yes hus";

    return 0;

    }