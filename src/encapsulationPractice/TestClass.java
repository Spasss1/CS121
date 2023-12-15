public class TestClass {
    public static void main(String[] args) {
        // Create an instance of MyClass
        packagesDemo myObject = new TestClass(1, "PublicValue", 2, "PrivateValue");

        // Access public variables and methods
        System.out.println("Public Variable 1: " + myObject.publicVar1);
        System.out.println("Public Variable 2: " + myObject.publicVar2);
        myObject.publicMethod();

        // Access default and protected methods (within the same package)
        myObject.defaultMethod();
        myObject.protectedMethod();

        // Uncommenting the lines below will result in compile-time errors
        // Uncommenting this line will result in an error because privateVar1 is private
        // System.out.println("Private Variable 1: " + myObject.privateVar1);
        // Uncommenting this line will result in an error because privateVar2 is private
        // System.out.println("Private Variable 2: " + myObject.privateVar2);
        // Uncommenting this line will result in an error because privateMethod is private
        // myObject.privateMethod();
    }
}
