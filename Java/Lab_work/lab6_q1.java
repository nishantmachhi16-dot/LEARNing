package Lab_work;

public class lab6_q1 {

    public static void main(String[] args) {

        partTime emp1 = new partTime();
        emp1.salary(12300);

        fullTime emp2 = new fullTime();
        emp2.salary(243323);


    }

}

abstract class empSalary {

    public abstract void salary(int a);

}

class partTime extends empSalary{

    int a;

    public void salary(int a ){

        this.a = a;

        System.out.println("the salary : " + a*6);


    }

}


class fullTime extends empSalary{


    @Override
    public void salary(int a ){
        
        System.out.println("the salary : " + a*12);


    }

}