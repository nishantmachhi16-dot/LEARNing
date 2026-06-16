import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class aboutFiles {

    public static void main(String[] args) {

        // creating a file

        System.out.println("Creating a file \n");

        // File name with file path for putting file in specific folder.
        File f1 = new File("AboutFile.txt");

        try {

            if (f1.createNewFile()) {

                System.out.println("The file has been created. \n");

            } else {

                System.out.println("The file already exists. \n");

            }

        } catch (IOException e) {

            System.out.println("The error occured while creatig a file \n");

        } catch (Exception ee) {

            System.out.println("Some other problem occured");

        }




        // Writing in a file.

        System.out.println("Writing into a file");

        // The try resource block will automatically closes a file that was opened
        try (FileWriter writeF1 = new FileWriter("AboutFile.txt")) {

            String data = "This Data has been uploaded into a file successfully";

            writeF1.write(data);

            System.out.println("The Txt has been added to a file\n");

        } catch (IOException e) {

            System.out.println("some error occured adding the text\n");

        }



        

        System.out.println("Appending data into a file\n");

        try (FileWriter appendF1 = new FileWriter("AboutFile.txt", true)) {

            String appendData = "\nThe Data has been appended into a file";

            appendF1.write(appendData);

            System.out.println("The data has been appended\n");

        } catch (IOException e) {

            System.out.println("Some kind of Error occured Appending data\n");

        }

        System.out.println("Reading a file\n");

        try (Scanner readf1 = new Scanner(f1)) {

            while (readf1.hasNextLine()) {

                String readFData = readf1.nextLine();

                System.out.println(readFData);

            }

        } catch (FileNotFoundException e) {

            System.out.println("Some kind of error detected while reading the file");

        }

        System.out.println("About File :\n");

        if (f1.exists()) {

            System.out.println("The name of the file : " + f1.getName() + "\n");

            System.out.println("The path of the file : " + f1.getAbsolutePath() + "\n");

            System.out.println("Total size : " + f1.length() + "\n");

            System.out.println("Can read : " + f1.canRead() + "\n");

            System.out.println("Can write : " + f1.canWrite() + "\n");

            System.out.println("Can execute : " + f1.canExecute() + "\n");

            System.out.println("Last Modified : " + f1.lastModified() + "\n");

        } else {

            System.out.println("The file does not found.");

        }

        System.out.println("Deleting the file : \n");

        File f2 = new File("AboutAnotherFile.txt");

        try {

            if (f2.createNewFile()) {

                System.out.println("The file has been created of file 2");

            } else {

                System.out.println("The file already exists");

            }

        } catch (IOException e) {
            System.out.println(
                    "some error has occured");
        }

        if (f2.exists()) {

            f2.delete();
            System.out.println("The file has been deleted");
        
        }else{

            System.out.println("The file hasn't been found");

        }
    
    }


}
