import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void readAndWriteFiles() throws IOException {
       File file = new File("C:\\Users\\david\\OneDrive\\Documents\\hello.txt");
        File file1=new File("C:\\Users\\david\\OneDrive\\Documents\\hello2.txt");
        try(BufferedReader read = new BufferedReader(new FileReader(file));
        BufferedWriter wr=new BufferedWriter(new FileWriter(file1))) {
            String reads;
            while ((reads = read.readLine()) != null) {
                wr.write(reads);
                wr.newLine();
            }
        }

    }
    public static void writeUserInput() throws IOException{
        Scanner sc=new Scanner(System.in);
        try(BufferedWriter wr=new BufferedWriter(new FileWriter("C:\\Users\\david\\OneDrive\\Documents\\text.txt"))){
            System.out.println("enter the text to write in a file:");
            String txt=sc.nextLine();
            wr.write(txt);
            wr.newLine();
        }
    }
    public static void modifyTextFile() throws IOException{
        Scanner sc=new Scanner(System.in);
        try(BufferedWriter wr=new BufferedWriter(new FileWriter("C:\\Users\\david\\OneDrive\\Documents\\text.txt",true))){
            System.out.println("enter the text to modify a file:");
            String txt=sc.nextLine();
            wr.write(txt);
            wr.newLine();
        }
    }
    public static void searchWord() throws IOException{
        Scanner sc=new Scanner(System.in);
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documents\\hello.txt"))){
            System.out.println("enter the word to search:");
            String word=sc.next();
            String read;
            int count=0;
            while((read=br.readLine())!=null){
                String[] words=read.split("\\s+");
                for(String w:words){
                    if(w.equals(word)){
                        count++;
                    }
                }
            }
            if(count>=1){
                System.out.println("the word "+word+" is found "+count+" times");
            }else System.out.println("the word "+word+" is not found");
        }
    }
    public static void txtToCsv() throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documents\\electronics.txt"));
        BufferedWriter wr=new BufferedWriter(new FileWriter("C:\\Users\\david\\OneDrive\\Documents\\ouput.csv"))){
            String line;
            while((line=br.readLine())!=null){
                line=line.trim();
                String[] words=line.split("\\s+");
                String csvFile=String.join(",",words);
                wr.write(csvFile);
                wr.newLine();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
    //readAndWriteFiles();
        //writeUserInput();
        //modifyTextFile();
        //searchWord();
        //txtToCsv();
        System.out.println("1.to read content from the user and write it into another file\\n"+"2." +
                "2.from the file to another file\n"+"3.to modify the content of a file\n"+"4.to search for a particular word in a file and display how many times it appears read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.\n"+"5.exit\n");
        System.out.println("enter the choice:");
        switch(sc.nextInt()){
            case 1:
                writeUserInput();
                System.out.println("the operation executed successful");
                break;
            case 2:
                readAndWriteFiles();
                System.out.println("the operation executed successful");
                break;
            case 3:
                modifyTextFile();
                System.out.println("the operation executed successful");
                break;
            case 4:
                txtToCsv();
                System.out.println("the operation executed successful");
                break;
            case 5:
                break;
        }
    }
}