import staticActivity.MyStaticClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStaticClassTest {

    private MyStaticClass instance1;
    private MyStaticClass instance2;

    @BeforeEach
    public void setUp() {
        instance1 = new MyStaticClass(1, "Instance 1", 3.14);
        instance2 = new MyStaticClass(2, "Instance 2", 2.71);
    }

    @Test
    public void testInstanceCount() {
        int count = MyStaticClass.getInstanceCount();

        assertEquals(2, count);
    }
}
