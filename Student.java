
abstract class Person {

    abstract void displayInfo();

    void showMessage() {
        System.out.println("Student Record");
    }
}

// Inheritance
class Student extends Person {

    // Encapsulation
    private String name;
    private int rollNo;
    private String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    // Polymorphism
    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }
}

// Main class for testing
class TestStudent {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Person p = new Student("Ibraheem", 10, "IT");

        p.showMessage();
        p.displayInfo();
    }
}
