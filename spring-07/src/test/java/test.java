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
        //单例测试
        User ts1 = (User) context.getBean("TS");
        User ts2 = (User) context.getBean("TS");
        System.out.println(ts1==ts2?"是同一个对象":"不是同一个对象");

        //prototype
        User tp1 = (User) context.getBean("TP");
        User tp2 = (User) context.getBean("TP");
        System.out.println(tp1==tp2?"是同一个对象":"不是同一个对象");


    }
}
