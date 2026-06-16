import java.util.Scanner;


public class CarCNO{


    String cname;
    String cmodel;

void carinfo(int cnum){

    System.out.println("CAR : " + cnum );


    System.out.print("Name : " + cname + "\t");

    System.out.print("Model : " + cmodel + "\t\n");


}


public static void main(String[] args){

Scanner car1 = new Scanner(System.in);



CarCNO c1 = new CarCNO();

System.out.println("Enter Car 1'S Name : ");
c1.cname = car1.nextLine();

System.out.println("Enter Car 1'S Model : ");
c1.cmodel = car1.nextLine();

c1.carinfo(1);


CarCNO c2 = new CarCNO();

System.out.println("Enter Car 2'S Name : ");
c2.cname = car1.nextLine();

System.out.println("Enter Car 2'S Model : ");
c2.cmodel = car1.nextLine();


c2.carinfo(2);


car1.close();


c1.carinfo(1);
c2.carinfo(2);


}


}


