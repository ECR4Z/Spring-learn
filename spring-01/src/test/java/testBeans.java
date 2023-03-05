import com.ming.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class testBeans {
    @Test
    public void testWay(){
        //实例化容器对象
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");

        //获取bean
        User user = (User)context.getBean("user");
        user.showInfo();

    }
}
