package Lab_work;

import Lab_package.*;
import java.util.*;

public class Lab4_q3_swap_2nd {

    public static void main(String[] args) {

        System.out.println("Enter any two numbers : ");

        Scanner nums = new Scanner(System.in);

        int num1 = nums.nextInt();

        nums.nextLine();

        int num2 = nums.nextInt();

        Lab4_q3_swap_1st.swap(num1, num2);

        nums.close();

    }

}
