import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // Additional methods for managing students and courses in the university
}
