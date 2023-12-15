class MyClass {
    // 4 instance variables
    private int var1;
    private String var2;
    private double var3;
    private boolean var4;
    public MyClass() {
        this.var1 = 0;
        this.var2 = "Default";
        this.var3 = 0.0;
        this.var4 = false;
    }

    // Constructor with 1 parameter
    public MyClass(int var1) {
        this.var1 = var1;
        this.var2 = "Parameterized";
        this.var3 = 0.0;
        this.var4 = false;
    }

    // Constructor with at least 3 parameters
    public MyClass(int var1, String var2, double var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = false;
    }

    // Getter and setter methods
    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public double getVar3() {
        return var3;
    }

    public void setVar3(double var3) {
        this.var3 = var3;
    }

    public boolean isVar4() {
        return var4;
    }

    public void setVar4(boolean var4) {
        this.var4 = var4;
    }

    // Overloaded method
    public String performAction(int num) {
        return "Action performed with parameter: " + num;
    }

    // Overloaded method
    public String performAction(String text) {
        return "Action performed with parameter: " + text;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of MyClass using each constructor
        MyClass obj1 = new MyClass();                         // Default constructor
        MyClass obj2 = new MyClass(42);                     // Constructor with 1 parameter
        MyClass obj3 = new MyClass(10, "Hello", 3.14);   // Constructor with at least 3 parameters

        // Call overloaded methods and print the returned values
        String result1 = obj1.performAction(5);
        String result2 = obj2.performAction("World");

        System.out.println(result1); // Output: Action performed with parameter: 5
        System.out.println(result2); // Output: Action performed with parameter: World
    }
}
