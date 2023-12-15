package staticActivity;

public class MyStaticClass {
    private int variable1;
    private String variable2;
    private double variable3;
    private static int instanceCount = 0;


    public MyStaticClass(int var1, String var2, double var3) {
        this.variable1 = var1;
        this.variable2 = var2;
        this.variable3 = var3;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

}






