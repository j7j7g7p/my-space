import com.lsl.demo.spring5.service.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
public class TestJUnit5 {

    @Autowired
    MemberService memberService;

   /* @BeforeEach
    public void before(){
        System.out.println("准备数据");
    }

    @AfterEach
    public void after(){
        System.out.println("测试结束");
    }*/

    @Test
    public void test(){
        System.out.println("测试开始"+memberService);
    }
}
