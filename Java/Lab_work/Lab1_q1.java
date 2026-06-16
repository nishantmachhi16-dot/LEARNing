package Lab_work;

public class Lab1_q1 {

public static void main(String[] args) {

    int arr[] =  {1,3,4,6,7};

    for (int i : arr) {
        System.out.print(i);        
    }

// two dimen arrray
    int array[][] = {

        {122,4456,5465},
        {322,45,335}

    };

    for(int i =0 ; i< array.length; i++){

        for(int j = 0; j< array[i].length; j++){

        System.out.print(array[i][j] + " ");
        }
    }


//three dimen array

int a[][][] = {
    {
        {1,2,3},
        {1,2,3}
    }, 
    {
        {1,23,3},
        {434,5656,76}
    }

                };

for(int i = 0 ; i < a.length; i++){

    for(int j = 0 ; j< a[i].length; j++){

        for(int k =0 ; k< a[i][j].length; k++){

            System.out.print(a[i][j][k]);

        }
System.out.println();
    }
System.out.println();
}


}

}