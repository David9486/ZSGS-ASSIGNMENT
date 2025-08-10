import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws AuthenticationException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the password:");
        String password=sc.nextLine();
        System.out.println("enter the username:");
        String user=sc.nextLine();
        LoginSystem login=new LoginSystem();
        login.setPasswd("david@76399");
        login.setUserName("David_93");
        try{
            if(login.getPasswd().equals(password)&&login.getUserName().equals(user)){
                System.out.println("authentication is successfully");
            }
            else{
                throw new AuthenticationException("sorry invalid username or password");
            }
        }catch(Exception a){
            System.out.println(a.getMessage());
        }

    }
}