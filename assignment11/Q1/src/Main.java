import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("\\C:\\Users\\david\\OneDrive\\Documents\\hello.txt\\");
        BufferedReader read=new BufferedReader(new FileReader(file));
        String readLine;
        while((readLine=read.readLine())!=null){
            System.out.println(readLine);
        }
    }
}