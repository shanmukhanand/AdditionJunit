import com.gsit.MainClass;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class AppTest  {

    @Test
    public void testResult() throws IOException
    {
        assertEquals(new MainClass().addition(10,20),100);
        System.out.print("Test done");
    }

}
