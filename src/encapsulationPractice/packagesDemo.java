package encapsulationPractice;

public class packagesDemo {
    public int publicVar1;
    public String publicVar2;
    private int privateVar1;
    private String privateVar2;
    public packagesDemo(int publicVar1, String publicVar2, int privateVar1, String privateVar2) {
        this.publicVar1 = publicVar1;
        this.publicVar2 = publicVar2;
        this.privateVar1 = privateVar1;
        this.privateVar2 = privateVar2;
    }
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Method with protected access modifier
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}
