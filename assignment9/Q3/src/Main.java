//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("Random");
        }catch(Exception e){
            throw new ClassNotFoundException ("error: "+e.getMessage());
        }
    }
}