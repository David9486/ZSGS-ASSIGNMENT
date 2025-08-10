//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        try {
            Student student1 = new Student("David", 1001, "CSE");
            Student student2 = (Student) student1.clone();
            System.out.println(student1);//original
            System.out.println(student2);//cloned
            student1.name = "Kevin";
            student2.rollno = 1005;
            System.out.println(student1);//original
            System.out.println(student2);//cloned
        }
        catch(Exception e){
            System.out.println("clone is not supported here");
        }
        //changes to the original object's String and integer values. Only affects the integer values not the String type
        //this called shallow copy
        /*if clonable is not implemented it throws an exception
        called java.lang.CloneNotSupportedException
         */
    }

}