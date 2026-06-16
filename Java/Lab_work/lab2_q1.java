package Lab_work;

public class lab2_q1 {
    

    public static void main(String[] args) {


    
//three dimen array

int a[][] = 
    {
        {1,2,3},
        {1,2,3}
    };

int b[][] = 
    {
        {1,2,3},
        {1,2,3}
    };


for(int i = 0 ; i < a.length; i++){

    for(int j = 0 ; j< a[i].length; j++){

        System.out.print(a[i][j] * b[i][j]);

    }
System.out.println();
}
        
    }

}
