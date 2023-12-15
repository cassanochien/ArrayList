
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>() ;

    public StudentList() {
        Student stu00 = new Student(007, "Mr.Cassano",9.3);
        students.add(stu00);
}
    public List<Student> getStudentList () {
        return students;
    }
    public void Create(){
        Student stu01 = new Student(007, "Mr.Cassano",8.1);
        Student stu02 = new Student(007, "Mr.Cassano",7.9);
        Student stu03 = new Student(007, "Mr.Cassano",9.1);
        Student stu04 = new Student(007, "Mr.Cassano",8.8);
        Student stu05 = new Student(007, "Mr.Cassano",9.6);

            students.add(stu01);
            students.add(stu02);
            students.add(stu03);
            students.add(stu04);
            students.add(stu05);
    }
    public void Display() {
        System.out.println("=============================");
            for (int i = 0; i < students.size(); i++) {
                System.out.println("" + students.get(i));
            }
    }
    public void Updates() {
        System.out.println("Enter index of Students to UPDATE: ");
            int index = Main.in.nextInt();
            if (index < students.size()) {
                System.out.println("We update the student "+ index + " for you <3");
                Student newStudent = new Student(219, "Mr Vincenzo", 8.0);
                students.set(index, newStudent);
                Display();
            } else {
                    System.out.println("Invalid Index");
            }
    }
    public void Delete() {
        System.out.println("Enter the Index of Students to Eliminate: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("We Remove the Student " + index + " for you <3");
            students.remove(index);
            Display();
        } else {
            System.out.println("Invalid Index");
        }
    }
}