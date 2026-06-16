public class Strings {
 
    public static void main(String[] args){

        
System.out.println("\n\t Strings-----------------\n");

/* Strings  */


String str1 = "\"The Maharaja sayajirao university of baroda\"";


System.out.println("\t" + str1 + "\n");

System.out.println("\t the length of the string is : " + str1.length() + "\n");

System.out.println("\t THE UPPERCASE : " + str1.toUpperCase() + "\n");

System.out.println("\t the lowecase : " + str1.toLowerCase() + "\n");

System.out.println("\t The index of the word maharaja is : " + str1.indexOf("Maharaja") + "\n");

System.out.println("\t the character at index 14 is : " + str1.charAt(14) + "\n");

System.out.println("\t trimed version : " + str1.trim() + "\n");


String str2 = " \'The Parul University\' ";

String str3 = "The Parul University";

System.out.println("\t is str1 equal to str2 ? : " +  str1.equals(str2) + "\n" );

System.out.println("\t is str2 equal to str1 ? : " + str2.equals(str3) + "\n" );

String str4 = " And ";

System.out.println("\t" + str1.concat(str4).concat(str2) + "\n");




    }

}
