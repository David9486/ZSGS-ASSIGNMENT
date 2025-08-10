import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\david\\OneDrive\\Documents\\hello.txt",true))){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the content you want to append into the file:");
            System.out.println("type exit to stop!");
            while (true) {
                String line=sc.nextLine();
                if(line.equalsIgnoreCase("exit")){
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
        }
    }
}