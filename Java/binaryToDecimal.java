import java.util.Scanner;

public class binaryToDecimal {
    

    public static void main(String[] args) {
        

        Scanner decimalNum = new Scanner(System.in);

        System.out.println("Enter the any Decimal to convert decimal into binary: \n");
        int num1 = decimalNum.nextInt() ;

        System.out.println("You have entered : " + num1);

        decimalNum.close();

        String binary = Integer.toBinaryString(num1);
        System.out.println("Here is the binary cinversion of the decimal number : " +binary);
 

    }


}
