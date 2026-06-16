public class WrapperClass {
 


    public static void main(String[] args){



// Auto boxing

        Integer a = 1000;

        Float b = 10.655f;

        Double c = 10.875;

        Short d = 10;

        String e = "nishant";

        Character f = 'n';

        System.out.println(a + b + c + d + e + f);
        
// Unboxing
        
        int A = a;

        float B = b;

        double C = c;

        short D = d;

        String E = e; 

        char F = f;

        boolean G = true;

        System.out.println(A + B +C + D + E + F + G);
        

//to String function


        String aa = Integer.toString(a);
        String bb = Float.toString(B);
        String cc = Double.toString(C);
        String dd = Short.toString(D);
        String ff = Character.toString(F);

        System.out.println(aa+bb+cc+dd+ff);

//parse function

String aaaa = "12234";
String bbbb = "3.2242";

Integer aaa = Integer.parseInt(aaaa);

Double bbb = Double.parseDouble(bbbb);

        System.out.println(aaa + bbb);  


// Misc functions


char ch = 'a';

System.out.println(Character.isLetter(ch));
System.out.println(Character.isDigit(ch));


    }   

    

}
