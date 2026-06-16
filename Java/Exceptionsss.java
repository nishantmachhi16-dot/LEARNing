import java.io.FileNotFoundException;

public class Exceptionsss {




public static void div(int num1, int num2){

    int result = num1 / num2;

    System.out.println("The Division :" + result + "\n");


}


    public static void main(String[] args){


// Try catch block.

    System.out.println("Try & Catch blocks");




        try{

            int num1 = 10;
            int num2 = 0;


            Exceptionsss.div(num1, num2);


        }catch(Exception w){


    System.out.println("Something went wrong \n" + w.getMessage());


        }finally{



    System.out.println("The Task has been complete...\n");
    

        }



/*throw - used to create a custom error. */

    System.out.println("Throw statmemnts : \n");


int Age = 19 ;

if(Age<18){

    throw new ArithmeticException("The age for voting should be above 18.\n");

}else{

    System.out.println("You are allowed to vote.\n");

}



//Multiple Catch blocks

        System.out.println("Multiple Catch Blocks & Multi - Catch blocks\n");



try{

    int tryone[]={1,2,3,4,5,6};

    System.out.println(tryone[8]);


}catch(ArithmeticException e){

        System.out.println("The number 2 is invalid");


}catch(ArrayIndexOutOfBoundsException eee){
    
        System.out.println("Array index does not exists");


}catch(Exception | Error ee){
    
        System.out.println("Something went wrong or some error has occured");


}







    }
}