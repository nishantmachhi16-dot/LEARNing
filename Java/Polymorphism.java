public class Polymorphism {
    
public static void GTPL(){

    System.out.println(" Welcome to GTPL ");

}


    public static void main(String[] args){

Polymorphism.GTPL();

Sony Sab = new Sony();
Sab.Tvchannle();;

Star sports = new Star();
sports.Tvchannle();


    }

}


class Sony extends Polymorphism  {

public void Tvchannle(){

System.out.println("You have selected Sony Network ");


}

    
}


class Star extends Polymorphism  {

public void Tvchannle(){

System.out.println("You have selected Star Network ");


}
    
}

