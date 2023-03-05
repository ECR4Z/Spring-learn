import com.ming.pojo.User;
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
        //手动装配
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
        user.getCat().shout();
        user.getDog().shout();

        //自动装配byName
        User userByName = (User) context.getBean("userByName");
        System.out.println(userByName.getName());
        userByName.getCat().shout();
        userByName.getDog().shout();

        //自动装配byType
        User userByType = (User) context.getBean("userByType");
        System.out.println(userByType.getName());
        userByType.getCat().shout();
        userByType.getDog().shout();
    }

}
