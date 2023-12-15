import java.util.ArrayList;
import java.util.Scanner;
public class TestClasses {
    public static void main(String[] args) {
        StringArrayList stringList = new StringArrayList();
        stringList.addString("Apple");
        stringList.addString("Banana");
        stringList.addString("Cherry");
        stringList.addString("Date");

        stringList.displayElements();

        System.out.println("Size of StringArrayList: " + stringList.getSize());
        System.out.println("Element at index 2: " + stringList.getElementByIndex(2));

        CourseInfo courseInfo = new CourseInfo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter course name (q to quit): ");
            String courseName = scanner.nextLine();
            if (courseName.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter score: ");
            int score = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter letter grade: ");
            String letterGrade = scanner.nextLine();

            courseInfo.addCourse(courseName, gpa, score, letterGrade);
        }

        courseInfo.printCourseInfoTable();
    }
}