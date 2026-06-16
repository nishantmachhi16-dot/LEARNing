class NormalClass{

 public void overridingMethod(){


 }

}

interface NormalInterface{
    
    void justInterface();

}


public class Anonymous {
    
    public static void main(String[] args){

        NormalClass N1 = new NormalClass(){

            public void overridingMethod(){

                System.out.println("You have Overrided a method.");

            }

        };

        N1.overridingMethod();

        NormalInterface NI1 =  new NormalInterface() {
            
            public void justInterface(){

                System.out.println("You have just created a method for interference using anonymous class.");

            }

        };


        NI1.justInterface();

    }



}
