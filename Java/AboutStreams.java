import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;


import java.util.*; 







public class AboutStreams {

    
    public static void main(String[] args){

        //requesting a JVM to Run garbage collector in two ways

        System.out.println("GC is being called for checking the unreachable objects");
        
        System.gc();

        Runtime.getRuntime().gc();


        Scanner  obj1 = new Scanner(System.in);
        obj1 = null;




        //FileInputStream & FileOutputStream class used


        System.out.println("Creating a file using a FileInoutStream class : \n");


        File f1 = new File("AboutStream.txt");

        try {
            
            if (f1.createNewFile()) {
                
                System.out.println("The file has been created:" + f1 + "\n");

            } else {
                
                System.out.println("The file already exists :" + f1 + "\n");


            }


        } catch (Exception e) {

            System.out.println("The error occured while creating a file. \n");

        }




        
        System.out.println("Reading a file using FileInputStream class: \n");


        try (FileInputStream inputF1 = new FileInputStream(f1)) {
            
            int i;

            System.out.println("The data : \n");

            while ((i = inputF1.read()) != -1) {
                
                    System.out.print((char) i);

            } 


        } catch (IOException e) {
            
            System.out.println("The Problem occured while Fetching the data\n");

        }



        //copy files using FileInputStream

        System.out.println("copy files using FileInputStream :\n");

        File f2 = new File("AboutCopyTo.txt");


        try (FileInputStream copyFrom = new FileInputStream(f1);
            FileOutputStream copyTo = new FileOutputStream(f2)
        ) {

            int i ;

            while ((i = copyFrom.read()) != -1) {
                
                copyTo.write(i);

            }
            
            System.out.println("The file has been copied successfully. \n");


        } catch (IOException e) {

            System.out.println("Some error has occured while coping this file\n");

        }




        System.out.println("Writing the data using FileOutputStream class.\n");

        //writing a file using FileInputStream class
        
        String msg = "Hello its me from MSU...\n";

        try (FileOutputStream writeStreamF1 = new FileOutputStream(f1)) {
            


            writeStreamF1.write(msg.getBytes());

            System.out.println("The file has been written successfully\n");

        } catch (IOException e) {

            System.out.println("Some error caused while writing a file\n");

        }



            System.out.println("Appending the data using FileOutputStream class.\n");


            //appendig the data


            String append = "Appending a message to file. \n";

            try (FileOutputStream appendStreamF1 = new FileOutputStream(f1,true)) {


                appendStreamF1.write(append.getBytes());

                System.out.println("The message has been appended in a file.\n");

                

            } catch (IOException e) {
                

                System.out.println("Some error occured appending the data.\n");

            }

        

    }

}
