package Lab_work;
import java.util.*;


public class trevel {


            
        static void svar(){

            
        System.out.println("eneter the num : ");

        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        int temp;
        obj.close();

        temp = a;
        a = b;
        b= temp;

        System.out.println( a + " " + " " + b);


        }


        void svar(int a, int b){

            int temp;

            temp =a;
            a = b;
            b = temp;

            System.out.println(a+"" + "" + b);

        }

    

    public static void main(String[] args) {

svar();

trevel obj = new  trevel();

obj.svar(10, 29);
        

day one  = day.MONDAY;
System.out.println(one);

System.out.println(day.valueOf("TUESDAY"));

System.out.println(one.ordinal());


    }


    

enum day{

    MONDAY,
    TUESDAY,
    WEBNESDAY

}




}
