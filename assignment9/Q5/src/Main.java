//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int div(int a,int b){
        try{
            int div=a/b;
            return div;
        }catch(ArithmeticException e){
            System.out.println("error! :"+e.getMessage());
        }finally{
            System.out.println("hello I'm finally");
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(div(10,2));
    }
}