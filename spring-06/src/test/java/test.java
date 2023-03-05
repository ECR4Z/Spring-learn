import com.ming.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User pUser = (User) context.getBean("pUser");
        pUser.show();
        User cUser = (User) context.getBean("cUser");
        cUser.show();
    }
}
