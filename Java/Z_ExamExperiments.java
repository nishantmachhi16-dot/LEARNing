public class Z_ExamExperiments {

//variables
static String name= "Nishant";
String lname = "R***";

    public static void main(String[] args){

// data types

//premetive datatype

int r = 1;
float fees = 213.334f;
double fees_Double = 232.45455;
long fees_Long = 1242456;

System.out.println(r + fees + fees_Double + fees_Long);

//premetive datatype 

String name[] = {"213", "Nishant", "47900"};

for (String string : name) {
    
System.out.println(string);

}


//type casting

//automatic casting
int num = 12354;
double d_Num = num;

System.out.println("automating casting :" + d_Num);

float f_Num = 213.334f;
int num2 = (int) f_Num;

System.out.println("Manual casting : " + num2);


//operator in JAVA

System.out.println(123 + 344);


//for loop with if else , continue

for(int i = 1; i <= 10; i++){

    if(!(i % 2 ==  0)){
        
        continue;
    
    }else{

        System.out.println(i);

    }

}


//while loop do while

int ii = 1;

while(ii < 10){

    System.out.println(ii);
    ii++;

}


do{

    System.out.println(ii);
    ii++;

}while(ii < 10);


String[] names = {"Nishant" , "R@@@" , "Someone" , "hella fluck off"};

for(String namesss : names){

    System.out.println("The names :" + namesss);

}

Z_ExamExperiments s1 =new Z_ExamExperiments();
s1.hello();

sum(213,323);


}
 

    //functions 

     void hello(){

        System.out.println("Hello");

    }

    
        

    static int sum(int num12 , int num122){
     
        return num12 + num122;

    }


}