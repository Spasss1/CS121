package classActivity;

public class TestClass {
    public static void main(String[] args) {
        // Instantiate the Student class
        Student student = new Student("John", 20, 3.8);

        // Call the method to print student information
        System.out.println("Student Information:");
        student.printStudentInfo();

        // Instantiate the Car class
        Car car = new Car("Toyota", "Camry", 2022);

        // Call the method to print car information
        System.out.println("\nCar Information:");
        car.printCarInfo();
    }
}
