package utils;
import org.junit.Test;
import java.util.List;


public class ikFTest {
    @Test
    public void testIk(){
        String data="我测 我测";
        List<String> string = ikF.getString(data, false);
        System.out.println(string.toString());
    }
}
