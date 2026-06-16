abstract public class Abstract {
    
abstract void mine();

void extraIMP(){

    System.out.println("R...");

}

}


class SmallAbstract extends Abstract{

void mine(){

System.out.println("Nishant");


}
    
}

class Run{

public static void main(String[] args){

Abstract m1 = new SmallAbstract();

m1.mine();
m1.extraIMP();


}
 

}