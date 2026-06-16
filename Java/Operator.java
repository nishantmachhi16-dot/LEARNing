public class Operator {

    public static void main(String[] args){



System.out.println("\n \tairthmatic operations------------------- ");

/* airthmatic operations */

final int a = 10;
final int b = 20;


    System.out.println("\n\t" + (a + b));

    System.out.println("\t" + (a - b));

    System.out.println("\t" + (a * b));

    System.out.println("\t" + (a / b));

    System.out.println("\t" + (a % b));

    System.out.println("\t" + (a ^ b));



System.out.println("\n \tassignment operators------------------ \n");

/* assignment operators */


int val1 = 10;

System.out.println("\n\tthe += : " + (val1 += 2) );

System.out.println("\n\tthe -= : " + (val1 -= 2) );

System.out.println("\n\tthe *= : " + (val1 *= 2) );

System.out.println("\n\tthe /= : " + (val1 /= 2) );

System.out.println("\n\tthe *= : " + (val1 *= 2) );

System.out.println("\n\tthe ^= : " + (val1 ^= 2) );

System.out.println("\n\tthe %= : " + (val1 %= 2) );

System.out.println("\n\tthe ^= : " + (val1 ^= 2) );


System.out.println("\n\t comparison operator--------------\n" );

/* comparison operators */


int num1 = 45;

int num2 = 50;


if (num1==num2) 
    
    System.out.println("\t" + num1 + "  is equal to " + num2 + "\n");

else
    System.out.println("\t" + num1 + "  is not equal to " + num2 + "\n");


if (num1!=num2) 
    
    System.out.println("\t" + num1 + "  is not equal to " + num2 + " \n");

else
    System.out.println("\t" + num1 + "  is equal to " + num2 + "\n");




if (num1>num2) 
    
    System.out.println("\t" + num1 + "  is greater than " + num2 + "\n");

else
    System.out.println("\t" + num1 + "  is not greater than " + num2 + "\n");


if (num1<num2) 
    
    System.out.println("\t" + num1 + "  is less than " + num2 + "\n");

else
    System.out.println("\t" + num1 + "  is not less than " + num2 + "\n");



if (num1<=num2) 
    
    System.out.println("\t" + num1 + "  is less than or equal to " + num2 + "\n");

else
    System.out.println("\t" + num1 + "  is not less than or equal to " + num2 + "\n");


if (num1>=num2) 
    
    System.out.println("\t" + num1 + "  is greater than or equal to " + num2 + "\n");

else
    System.out.println("\t" + num1 + "  is not greater than or equal to " + num2 + "\n");




System.out.println("\n\t Logical operater-------------");

// logical operators

if ( (num1>=num2) && (num2>num1))
    System.out.println("\n\t both conditions are true \n");
else
    System.out.println("\n\t one of the condition is false \n");


if ( (num1>=num2) || (num1>num2))
    System.out.println("\n\t both conditions are true \n");
else
    System.out.println("\n\t one of the condition is true \n");


if (!(num1>=num2 && num2>num1)){
    System.out.println("\n\t both conditions are false \n");
}
else{ 
    System.out.println("\n\t one of the condition is true \n");
}



    }
    

}
