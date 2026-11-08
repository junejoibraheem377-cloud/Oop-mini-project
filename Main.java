
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        Student s1 = new Student(name, rollNo, department);

        students.add(s1);

        System.out.println("\nStudent Added Successfully!");

        System.out.println("\nStudent Information:");

        for (Student s : students) {
            s.displayInfo();
        }

        input.close();
    }
}
