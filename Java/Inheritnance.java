public class Inheritnance {

    public void Gym() {

        System.out.println("Welcome to Gym");

    }

}

class GymFees extends Inheritnance{

public static void GymFees(int GFees){

System.out.println("you have Paid : " + GFees);

}

    
}


class Gymname extends Inheritnance {

    public void GymName(String GName) {

        System.out.println("you have Purchased Membership of " + GName);

    }

    public static void main(String[] args) {

Gymname GName1 = new Gymname();

GName1.Gym();

GName1.GymName("FTG");

Inheritnance GymN1 = new Inheritnance();

GymN1.Gym();


GymFees.GymFees(10000);





    }

}