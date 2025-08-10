import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file{
 public static void main(String[] args) throws IOException {
 
  String filePath="C:\\Users\\david\\OneDrive\\Documents\\hello.txt";

  int linecount=0;
  int wordcount=0;
  int charcount=0;
 
  try {

   BufferedReader reader = new BufferedReader(new FileReader(filePath));
   String line;

   while ((line=reader.readLine()) !=null) {
    linecount++;

    charcount += line.length();
    String [] word =line.trim().split("\\s");


    if(!line.trim().isEmpty()){
    
     wordcount +=word.length;
    }
   
   }

   reader.close();

   System.out.println("Line Count "+ linecount);
   System.out.println("Word Count " +wordcount);
   System.out.println("Char Coutn "+charcount);

  
  } catch (IOException e) {

   System.out.println(" " + e.getMessage());
  
  }
 }
}