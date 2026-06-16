public class Typecasting {
    
public static void main(String[] args){

    

System.out.println("\n \ttype casting--------------- ");

    /* type casting  */

//implicit type casting

int integer = 97;

double int_into_double = integer;

System.out.println("\t" +int_into_double);


//explicit type casting
double double_into_int = 98.99;

int integer22 = (int) double_into_int;

System.out.println("\t" + integer22  + "\n");
 



System.out.println("\n \treal world example \n ");

//real world example converting int marks into double percentage

int value1 = 97;

int value2 = 100;

double percentage = (double) value1 / value2 * 100.000d;

System.out.println("\tthe percentage is : " + percentage + "% \n" );




}

}
