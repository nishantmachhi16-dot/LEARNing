package Lab_package;

public class Lab4_q3_swap_1st {
 
    public static void swap(int num1, int num2){

int temp;
int number1 = num1;
int number2 = num2;

temp = number1;
number1 = number2;
number2 = temp;

System.out.println("The before swapping the number  : ");


System.out.println("The un - swapped \n Number 1 : " + num1);

System.out.println("The un - swapped \n Number 2 : " + num2);



System.out.println("The After swapping the number  : ");


System.out.println("The swapped \n Number 1 : " + number1);

System.out.println("The swapped \n Number 2 : " + number2);

    }
    


}
