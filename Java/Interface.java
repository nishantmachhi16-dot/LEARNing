interface Numbers {


void first();


void second();


void three();
    
}

interface Alphabets{

    void a();

    void b();
    
    void c();

}

class SubInterface implements Numbers , Alphabets{


public void first() {
    
    System.out.println("fisrt");

}

public void second(){

    System.out.println("second");

}


public void three(){

    System.out.println("three");

}


public void a(){

    System.out.println("A");

}

public void b(){

    System.out.println("B");

}
public void c(){


    System.out.println("C");

}

}



public class Interface{

public static void main(String[] args){

SubInterface i1 = new SubInterface();

System.out.println("Numbers \n");

i1.first();
i1.second();
i1.three();


System.out.println("Alphabets \n");


i1.a();
i1.b();
i1.c();

}

}


