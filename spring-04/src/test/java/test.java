import com.ming.pojo.Man;
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
        //下标注入属性
        Man man1 = (Man) context.getBean("man1");
        man1.show();
        //name注入属性
        Man man2 = (Man) context.getBean("man2");
        man2.show();
        //类型注入属性
        Man man3 = (Man) context.getBean("man3");
        man3.show();
        //为bean设置别名
        Man man = (Man) context.getBean("man");
        man.show();
    }
}
