import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Date {  

public static void main(String[] args){


LocalDate L1 = LocalDate.now();
System.out.println("Current date : " + L1);


LocalTime T1 = LocalTime.now();
System.out.println("Current time : " + T1);

LocalDateTime TD1  = LocalDateTime.now();
System.out.println("Current Date and Time : " + TD1);

DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern(" \n dd - mm - yyyy \n hh : mm : ss");
    
String FDT = TD1.format(DTF1);

System.out.println("the formatted time and date : " + FDT);


}  


}
