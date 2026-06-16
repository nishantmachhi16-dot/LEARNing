
public class AddDigits{

    public static void main(String[] args) {
 
    int x = 1234;
    int digits;
 
    int sum = 0;

    while (x > 0){
    
        digits = x % 10;
        sum += digits;
        x = x / 10;

        
    }

System.out.println(sum);

}

}