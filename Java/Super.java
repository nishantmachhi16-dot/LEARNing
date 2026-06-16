public class Super {
        
    public static void main(String[] args){


        MSU c1 = new MSU();

        c1.collage1();

        
        


    }

}

class Collage {

    Collage(int num){

        System.out.println("Select collage from the List :");

    }

    void collage1(){

System.out.println(" 1.Msu 2.PU");


    }

} 


class MSU extends Collage{


    void collage1(){

System.out.println(" you have not selected PU");


    }
        

    MSU(){

        super(1);

        super.collage1();


        System.out.println("You have selected MSU");


    
    }

} 

    


