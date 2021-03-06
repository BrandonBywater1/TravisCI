import org.junit.Assert;
import org.junit.Test;

public class AddTwoTests {

    @Test
    public void test1() {
        System.out.println("Success");
    }

    @Test
    public void testAdd() {
        int expected = 5;
        Assert.assertEquals(expected, new AddTwo().addTwo(5, 1));
    }
}
