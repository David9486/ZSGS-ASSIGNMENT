//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Exception {
    public static void main(String[] args) {
        int[] arr={2,5,1,4,0,7};
        int quotient=0;
        try{
            quotient=arr[7]/arr[4];
        }
        catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}