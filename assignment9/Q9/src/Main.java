import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

            File file = new File("C:\\Users\\david\\OneDrive\\Documents\\check1.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String i;
            while((i=br.readLine())!=null){
                System.out.println(i);
            }
            fr.close();
        }catch(FileNotFoundException e){
            System.out.println("error: file can't be found");
        }catch(IOException a){
            System.out.println("file can't be accessed or be read");
        }
    }
}