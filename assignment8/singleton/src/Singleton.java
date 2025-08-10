public class Singleton {
    private static Singleton s;
    private Singleton(){
        System.out.println("instance created");
    }
    public static Singleton instance(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}
