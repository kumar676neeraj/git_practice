import java.util.Scanner;
import java.io.FileWriter;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {

            FileWriter writer = new FileWriter("C:/Users/Lenovo/desktop/hhh.txt"); // Specify the path of the file where
                                                                                   // you wish to store the output of
                                                                                   // this code

            System.out.print("Enter what you wish to write ");
            String line = scan.nextLine(); // read the line

            // write the input line to the file.
            writer.write(line);
            writer.close();

        } catch (Exception nothing) {
            System.out.println("nothing");
        }
        System.out.println("Done");
    }

}
