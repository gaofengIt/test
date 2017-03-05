import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by XSOOY on 2017/3/4.
 */

@Controller
@RequestMapping("test")
public class TestDemo {
    @Test
    public void test() {
        System.out.println("testest");
        System.out.println("version");

    }
}
