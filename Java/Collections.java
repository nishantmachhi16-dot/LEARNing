
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        


        System.out.println("Creating an ArrayLIst : \n");
    

        ArrayList<String> viruses = new ArrayList<>();


        viruses.add("Corona");
        viruses.add("Flu");
        viruses.add("Herples duplex");
        viruses.add("HIV");

        System.out.println("Types of viruses : \n");
        
        for (String string : viruses) {
            

            System.out.println( "Name : " + string + "\n");


        }


        System.out.println("Removing an element from array.\n");


        viruses.remove(1);

        for(String vname : viruses ){

            System.out.println("Name : " +vname + "\n");

        }




        System.out.println("Creating a HashTree");

        // works same as Arraylist but every values should be different.


        HashSet<Integer> roll_no = new HashSet<Integer>();


        //Adding an abject

        roll_no.add(1);
        roll_no.add(90);
        roll_no.add(61);
        roll_no.add(39);

    Iterator<Integer> I1 = roll_no.iterator();

    while (I1.hasNext()) {
        
        System.out.println("The HashSet : " + I1.next());

    }


        System.out.println("Removing an element : \n");

        //Removing an object

        roll_no.remove(90);

        
        for(Integer rn : roll_no){

            System.out.println("The Roll Number : " + rn + "\n" );

        }



        System.out.println("Creating a Hash Map. \n");


        HashMap<String,Integer> stud = new HashMap<String,Integer>();

        stud.put("Nishant", 90);
        stud.put("No one", 83424);
        stud.put("****", 23);
        stud.put("Adarsh", 1);
        
for(String name : stud.keySet()){

    System.out.println(name + stud.get(name)) ;

}




    HashMap<Integer,Integer> h2 = new HashMap<>();

    h2.put(1,4);
    h2.put(2,90);

    for(int Num : h2.keySet()){

        System.out.println( Num + "" + (h2.get(Num)));

    }



    }

}
