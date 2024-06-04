import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        MainClass mainClass = new MainClass();
        Assert.assertEquals("Метод getLocalNumber не равен 14", 14, mainClass.getLocalNumber());
    }
}
