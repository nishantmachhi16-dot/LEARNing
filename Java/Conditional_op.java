public class Conditional_op {

    public static void main(String[] args){



System.out.println("\n\t if , else if and else------------------\n" );


int a1 = 18;
int a2 = 20;

if (a1>a2){
    System.out.println("\t a1 is greater than a2 \n");
}

else if (a1<a2){
    System.out.println("\t a1 is less than a2 \n");
}

else{
    System.out.println("\t a1 is equal to a2 \n");
}



System.out.println("\n\t the ternary operator (short-hand property)------------------\n" );

int a3= a1>a2 ? a1 : a2 ;


System.out.println("\t the greater value between a1 and a2 is : " + a3 + "\n");



int time = 23;

String greetings = (time<12) ? "good morning "
                        : (time<18) ? "good afternoon "
                        : (time < 22) ? "good evening " 
                        : "god night";

    System.out.println("\t" + greetings + "\n");



    System.out.println("\t Swutch case statement------------------\n" );



String day = "four";

switch (day){

case "one" : 
    System.out.println("\t monday \n");
    break;

case "two" :
    System.out.println("\t tuesday \n");
    break;

case "three" : 
 System.out.println("\t wednesday \n");
    break;

case "four" : 
 System.out.println("\t thursday \n");
    break;
    
case "five" : 
 System.out.println("\t friday \n"); 
    break;

case "six" :
    System.out.println("\t saturday \n");
    break;

default :
    System.out.println("\t sunday \n");
    break;

}




    }

}

