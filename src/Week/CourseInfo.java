import java.util.ArrayList;

class CourseInfo {

    private ArrayList<String> courseNames;
    private ArrayList<Double> GPAs;
    private ArrayList<Integer> scores;
    private ArrayList<String> letterGrades;

    public CourseInfo() {
        courseNames = new ArrayList<>();
        GPAs = new ArrayList<>();
        scores = new ArrayList<>();
        letterGrades = new ArrayList<>();
    }

    public void addCourse(String courseName, double gpa, int score, String letterGrade) {
        courseNames.add(courseName);
        GPAs.add(gpa);
        scores.add(score);
        letterGrades.add(letterGrade);
    }

    public void printCourseInfoTable() {
        System.out.println("Course Name\tGPA\tScore\tLetter Grade");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.println(courseNames.get(i) + "\t" + GPAs.get(i) + "\t" + scores.get(i) + "\t" + letterGrades.get(i));
        }
    }
}