
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Roll Number: ");
                    int rollNo = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Department: ");
                    String department = input.nextLine();

                    Student s = new Student(name, rollNo, department);

                    manager.addStudent(s);
                    break;

                case 2:
                    manager.showStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    int searchRoll = input.nextInt();

                    manager.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
