public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and University to demonstrate the system
        Student student1 = new Student(1);
        Course course1 = new Course(101, "Mathematics");
        University university = new University();

        // Add student and course to the university
        university.addStudent(student1);
        university.addCourse(course1);

        // Add grades to the student
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(3.7);

        // Calculate and display GPA
        double gpa = student1.calculateGPA();
        System.out.println("Student GPA: " + gpa);
    }
}
