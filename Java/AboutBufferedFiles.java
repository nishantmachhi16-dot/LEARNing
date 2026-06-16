import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;












public class AboutBufferedFiles {

    
    public static void main(String[] args){


        System.out.println("creating a new file.\n");

        //creating a file


        File f1 = new File("AboutBufferedFiles.txt");

        try{
            
            if (f1.createNewFile()) {
                
                System.out.println("File created successfully.\n");

            }else{

                System.out.println("File already exists.\n");

            }


        } catch (IOException e) {
            
                System.out.println("Some error caused reading a file");

        }




        System.out.println("writing a file using BufferedWriter class..\n");

        //writing a file


        String msg = "just needed to write something. ";
        String msg2 = "created a nwe line";

        try (BufferedWriter writerBufferedF1 = new BufferedWriter(new FileWriter(f1))) {
            

            writerBufferedF1.write(msg);
        
            System.out.println("Message write down successfully. \n");


        } catch (IOException e) {

            System.out.println("Some kind of error occured writing a file.\n");

        }




        System.out.println("Appending the data using BufferWriter class.\n");
        
        //appending data


        try (BufferedWriter appendBufferedF1 = new BufferedWriter(new FileWriter(f1,true))) {
        
            appendBufferedF1.newLine();
            appendBufferedF1.write(msg2);
            appendBufferedF1.newLine();
            appendBufferedF1.write("The MSU");

            System.out.println("Data appended successfully.\n");

        } catch (Exception e) {

            System.out.println("Some kind of error occured while appending data.\n");

        }

        
        

        
        System.out.println("Reading a file using a BufferedReader class.\n");

        //reading a file

        try (BufferedReader readBufferF1 = new BufferedReader(new FileReader(f1));) {
            
            String data;

            System.out.println( "Data : \n ");


            while ((data = readBufferF1.readLine()) != null) {
                
            
            System.out.println(data);
        }


        } catch (IOException e) {
        
        System.out.println("Some problem occured while reading a file.\n");
        
        }




    }


}
