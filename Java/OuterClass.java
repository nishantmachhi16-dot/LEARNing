import java.util.Scanner;

public class OuterClass {




    void outerClass(int num1){

        while (true) {
            

        if(num1 ==  1) {

System.out.println("You have selected outer class.");
break;
        }

        else{

System.out.println("Enter valid number.");

break;
        }

    }
    
}



    class InnerClass{


    void iuterClass(int num1){

        if(num1 ==  2) {

System.out.println("You have selected innner class.");

        }

        else{

System.out.println("Enter valid number.");


        }

    }

    }



    public static void main(String[] args){

Scanner nums = new Scanner(System.in);

System.out.println("Enter a number,\n 1 : to access outer class.\n 2 : to access inner class.");
int num1 = nums.nextInt();


OuterClass o1 = new OuterClass();

OuterClass.InnerClass i1 = o1.new InnerClass();


o1.outerClass(num1);
i1.iuterClass(num1);

nums.close();

    }


    
}
