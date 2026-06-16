
public class Mathods{


    public static void main(String[] args){

        String names[] = { "Nish" , "Prapti" , "dumbs"};
        Integer roll[] = {1,2,4,5};        
        Double fees[]= {2000.45,43444.645,35535535.4354};

        another_loop_for_String(names);
        loop_through_arr(roll);
        loop_through_arr(fees);

}


static void loop_through_arr(Object[] arr_name){

    for(int i = 0; i < arr_name.length; i++){

        System.out.println("The Data " + (i + 1) + " : " + arr_name[i]);

    }

    System.out.println("End of the array");

}


static void another_loop_for_String(String[]str_arr){

    for(int i= 0; i< str_arr.length; i++ ){


System.out.println("The Names " + (i + 1) + " : " + str_arr[i]);



    }



}



}