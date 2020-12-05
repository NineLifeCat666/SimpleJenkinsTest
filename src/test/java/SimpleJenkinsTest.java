import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJenkinsTest {

    @Test
    void simpleTest(){
        int a = 5, b = 4, result, anotherResult = 10;
        result = a + b;

        Assertions.assertNotEquals(result, anotherResult);
    }
}

