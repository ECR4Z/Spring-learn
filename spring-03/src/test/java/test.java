import com.ming.dao.UserDaoC;
import com.ming.dao.UserDaoJava;
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

        UserDaoC c = (UserDaoC) context.getBean("c");
        c.doSomething();

        UserDaoJava java = (UserDaoJava) context.getBean("java");
        java.doSomething();
    }
}
