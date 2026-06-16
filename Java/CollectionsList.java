import java.util.*;

public class CollectionsList {
    
public static void main(String[] args) {

Scanner userInput  = new Scanner(System.in);
    

ArrayList<String> arrayList1 = new ArrayList<String>();

for (int i = 0; i < 5; i++) {
    
    System.out.println("Enter the name of the user : ");
    String uI = userInput.nextLine();

    arrayList1.add(uI);

    System.out.println("The name has been added iinto the data base : " + uI);

}

userInput.close();


Iterator<String> I1 = arrayList1.iterator();

while (I1.hasNext()) {
    
    System.out.println("the name :" + I1.next());

}



}


}
