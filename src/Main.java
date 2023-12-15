import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        StudentList studentList = new StudentList();
            while (true) {
                choice = Menu.getUserChoice();
                switch (choice) {
                    case 1:
                        studentList.Create();
                        break;
                    case 2:
                        studentList.Display();
                        break;
                    case 3:
                        studentList.Updates();
                        break;
                    case 4:
                        studentList.Delete();
                        break;
                    case 5:
                        return;
                        default:
                        System.out.println("Invalid choice");
        }
    }
    }
}