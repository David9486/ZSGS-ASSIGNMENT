public class Person implements Cloneable{
    String name;
    double salary;
    Employee e;
    public Person(String name,double salary,Employee e){
        this.name=name;
        this.salary=salary;
        this.e=e;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
