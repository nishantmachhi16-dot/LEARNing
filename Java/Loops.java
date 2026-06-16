import java.util.Scanner;

public class Loops {

    public static void main(String[] args){

        

System.out.println("\n\t loops in java-------------------\n");



System.out.println("\n\t while loop-------------------\n");

//while loop

int i = 0;

while(i<=10){

System.out.println("\t the value of i is : " + i + "\n");

i++;

}





System.out.println("\n\t for loop-------------------\n");


//for loop

for(int j=0; j<=10;j++){


    System.out.println("\n\t the value of j is : " + j);


}




System.out.println("\n\t do while loop-------------------\n");

//do while loop

int k = 0;

do{

    System.out.println("\n\t the value of k is : " + k);

    k++;

}while(k<=10);



System.out.println("\n\t nested for loop-------------------\n");

//nested for loop


int col, row;

Scanner scanner = new Scanner(System.in);

System.out.print("\n\t enter the number of rows: ");
col = scanner.nextInt();

System.out.print("\n\t enter the number of columns : ");
row = scanner.nextInt();

scanner.close();


for(int bb = 0 ; bb <= col ; bb++){

    for(int l = 0; l <= row ; l++){

// print prints the vlalue in the same line

        System.out.print( l  + "\t");

    }

//println prints the value and moves to the next line

System.out.println("");

}


System.out.println("\n\t for - each loop-------------------\n");

//for - each loop

String[] countries = {"India", "USA", "UK", "Canada", "Australia"};

for( String con : countries){

    System.out.println("\t" +con);
}


System.out.println("\n\t break and continue statement-------------------\n");

//break and continue statement


for(int n = 0 ; n <= 10 ; n++){

    if(n==6){

        System.out.println("\n\t breaking the loop at i = " + n + "\n");
        break;

    }

    if(n==3){

        System.out.println("\n\t continuing the loop at i = " + n + "\n");
        continue;
    }

    System.out.println("\tnumbers : " + n );

}



    


    }

    
}
