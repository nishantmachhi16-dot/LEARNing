
    import java.util.Scanner;


public class User_input{



    public static void main(String[] args){

        String fname,lname;


        Scanner userinfo = new Scanner(System.in);

        
        System.out.println("\tEnter the First name : \n");
        fname = userinfo.nextLine();


        System.out.println("\tEnter the Last name : \n");
        lname = userinfo.nextLine();
        
        userinfo.close();


        System.out.println("\tUser full name is : "+ fname + lname + "\n" );


    }

}
