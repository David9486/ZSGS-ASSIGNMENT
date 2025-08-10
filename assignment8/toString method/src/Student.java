public class Student {
    String name;
    int rollno;
    String department;
    public Student(String name,int rollno,String department){
        this.name=name;
        this.rollno=rollno;
        this.department=department;
    }
    @Override
    public String toString(){
        return name+" "+rollno+" "+department;
    }
}
