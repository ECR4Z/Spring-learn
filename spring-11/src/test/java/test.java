import com.ming.pojo.Dog;
import com.ming.pojo.MyConfig;
import com.ming.pojo.MyConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class test {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.name);

        Dog dog1 = (Dog) context.getBean("dog1");
        System.out.println(dog1.name);

    }
}
