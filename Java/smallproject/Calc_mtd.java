package smallproject;


import java.util.Scanner;


public class Calc_mtd {
    

    public static void main(String[] args){

        System.out.println("--------------Welcome to Calculator ---------------");

        
        System.out.println(" PLEASE ENTER TWO VALUES...");

        Scanner nums = new Scanner(System.in);

        int num1 = nums.nextInt();

        int num2 = nums.nextInt();

        System.out.println("Enter the Operation : \n (1.Add \t 2.Subtract \t 3.Multiply \t 4.Divide)");

        int operation = nums.nextInt();

        nums.close();

        switch (operation){

            case 1 :
                Add(num1 , num2);
                break;

            case 2 :
                Sub(num1 , num2);
                break;
                
            case 3 :
               Mul(num1 , num2); 
                break;
                
            case 4 :
                Div(num1 , num2);
                break;
                
            default : 
                System.out.println("\n\t Enter Valid Number...\n\tPlease try again.");
        };


    }


    public static void Add(int num1 , int num2){

        System.out.println("The Addition : " + (num1+num2));

    }

    
    public static void Sub(int num1 , int num2){

        System.out.println("The Subtraction : " +  (num1 - num2));


    }
    
    public static void Mul(int num1 , int num2){


        System.out.println("The Multiplication : " +  (num1 * num2));



    }
    
    public static void Div(int num1 , int num2){
 
        
        if(num1 != 0){

        System.out.println("The Division : " +  (num1 / num2));

        }
        else{

            
        System.out.println("Enter valid Value");



        }

    }



}
