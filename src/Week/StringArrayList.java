import java.util.ArrayList;
import java.util.Scanner;

class StringArrayList {
    private ArrayList<String> stringList;

    public StringArrayList() {
        stringList = new ArrayList<>();
    }

    public void addString(String str) {
        stringList.add(str);
    }

    public void removeString(String str) {
        stringList.remove(str);
    }

    public int getSize() {
        return stringList.size();
    }

    public String getElementByIndex(int index) {
        if (index >= 0 && index < stringList.size()) {
            return stringList.get(index);
        }
        return null;
    }

    public void displayElements() {
        System.out.println("List Elements (for each loop):");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("List Elements (regular for loop):");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}

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

