//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton s1=Singleton.instance();
        Singleton s2=Singleton.instance();
        System.out.println(s1==s2);
    }
}