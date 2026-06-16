public class S_Constructor {

    int sid;
    String sname;

    S_Constructor(int id, String name ){

        this.sid = id;
        this.sname = name;

    }

    S_Constructor(int id){

        this.sid = id;

    }

void display(int snum){

    System.out.println("Student information : " + snum);


    System.out.print("Id : " + sid + ",\t");

    System.out.print("Name : " + sname + ".\t\n");
}


public static void main(String[] args){

    

S_Constructor s1 = new S_Constructor(90, "Nishant");
S_Constructor s2 = new S_Constructor(23, "Riya");


s1.display(1);

s2.display(2);


Subject sub1 = new Subject();

sub1.subshow();



}

}


class Subject{

    void subshow(){


    System.out.println("Student selected subject : Maths");
        

    }


}

