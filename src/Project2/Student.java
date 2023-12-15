import java.util.ArrayList;

public class Student {
    private int studentId;
    private ArrayList<Double> grades;

    public Student(int studentId) {
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public double calculateGPA() {
        // Implementation of GPA calculation based on grades
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
}
