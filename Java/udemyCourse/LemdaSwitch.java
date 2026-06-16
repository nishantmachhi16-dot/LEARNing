

public class LemdaSwitch{

    public static void main(String args[]){

        int a = 3;

        //Simple Switch

        switch (a) {
            case 1:
                System.out.println("The num is 1");
                break;
        
            case 2:
                System.out.println("The num is 2");
                break;
        
            case 3:
                System.out.println("The num is 3");
                break;
        
            default:
            System.out.println("The num is null");
                break;
        }


        //shorthand Switche

        int b = 5 ;

        switch (b) {
            
            case 1 -> System.out.println("The num is 1");
            case 2 -> System.out.println("The num is 2");
            case 3 -> System.out.println("The num is 3");
            case 4 -> System.out.println("The num is 4");
            default -> somethingElse();
        }


    }


    public static void somethingElse(){

        System.out.println("The num is something else");

    }

}