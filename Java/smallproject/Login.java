package smallproject;
import java.util.Scanner;


public class Login {
    

    public static void main(String[] args ){


        System.out.println("----------------Welcome to LOGIN page----------------- ");

        System.out.println("\n \t \t Enter Login credentials below. \n ");

        Scanner login = new Scanner(System.in);

        String correct_unm = "Nishant187";
        String correct_pw = "Nishant@187";


        while (true) {
            

        System.out.println("\nUsername : ");
        String user_name = login.nextLine();

        System.out.println("\nPassword : ");
        String Password = login.nextLine();
        


        if(user_name.equals(correct_unm)  && Password.equals(correct_pw) ){

            System.out.println("\nWelcome back to your Account");
            break;

        }
        else{

            System.out.println("\nEnter valid login credentials,\nPlease try again.");
            

        }

    }
                login.close();
    }


}
