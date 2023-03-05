import com.ming.service.UserService;
import com.ming.service.UserServiceImpl;
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
        UserService serviceImpl = (UserService) context.getBean("userServiceImpl");
        serviceImpl.add();
    }
}
