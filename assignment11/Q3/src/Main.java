import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void wordsCount()throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documents\\hello.txt"))) {
            int countWords = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] words=line.split("\\s+");
                for(String s:words){
                    countWords++;
                }
            }
            System.out.println("the number of words present in file is: "+countWords);
        }
    }
    public static void LineCount() throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documents\\hello.txt"))) {
            int countLines = 0;
            while ((br.readLine()) != null) {
                countLines++;
            }
            System.out.println("the number of lines in file is: "+countLines);
        }
    }
    public static void charCount() throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documents\\hello.txt"))){
           String line;
           int countChar=0;
           while((line=br.readLine())!=null){
               for(char c: line.toCharArray()){
                   countChar++;
               }
           }
           System.out.println("the number of characters in file: "+countChar);
        }
    }
    public static void main(String[] args) throws IOException {
        wordsCount();
        LineCount();
        charCount();
    }
}