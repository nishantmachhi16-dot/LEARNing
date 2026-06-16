import java.util.Scanner;


public class Encapsulation {

    private String cat_name;

    public void set_name(String name){

        this.cat_name = name;

    }

    public String get_name(){

        
System.out.println("Your entered name : ");


        return cat_name;

    }


    public static void main(String[] args){


Scanner c1 = new Scanner(System.in);

System.out.println("Enter a name for cat : ");

String cname = c1.nextLine();


c1.close();


Encapsulation cat_name1 = new Encapsulation();

cat_name1.set_name(cname);

System.out.println(cat_name1.get_name());



    }

    
}
