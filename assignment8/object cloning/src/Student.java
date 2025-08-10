public class Student implements Cloneable{
    String name;
    int rollno;
    String department;
    public Student(String name,int rollno,String department){
        this.name=name;
        this.rollno=rollno;
        this.department=department;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return name+" "+rollno+" "+department;
    }
}
