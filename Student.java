
class Student {
    private String name;
    private int rollNo;
    private String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
