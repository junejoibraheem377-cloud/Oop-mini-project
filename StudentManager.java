
import java.util.ArrayList;

class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void showStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Found!");
            return;
        }

        for (Student s : students) {
            s.displayInfo();
            System.out.println("------------------");
        }
    }

    public void searchStudent(int rollNo) {

        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student Found!");
                s.displayInfo();
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}
