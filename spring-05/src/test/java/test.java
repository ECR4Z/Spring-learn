import com.ming.pojo.Workman;
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
        //常量注入
        Workman workman = (Workman) context.getBean("name");
        System.out.println(workman.getName());

        //bean注入
        Workman workmanAddress = (Workman) context.getBean("workmanAddress");
        System.out.println(workmanAddress.getAddress().getAddress());

        //数组注入
        Workman workmanHobby = (Workman) context.getBean("workmanHobby");
        String[] hobby = workmanHobby.getHobby();
        for(String h:hobby){
            System.out.print(h+" ");
        }
        System.out.println();

        //List注入
        Workman workmanList = (Workman) context.getBean("workmanList");
        System.out.println(workmanList.getFriends());

        //Map注入
        Workman workmanMap = (Workman) context.getBean("workmanMap");
        System.out.println(workmanMap.getCard());

        //Set注入
        Workman workmanSet = (Workman) context.getBean("workmanSet");
        System.out.println(workmanSet.getGames());

        //配置注入
        Workman workmanProperties = (Workman) context.getBean("workmanProperties");
        System.out.println(workmanProperties.getInfo());

        //空值注入
        Workman workmanGoal = (Workman) context.getBean("workmanGoal");
        System.out.println(workmanGoal.getGoal());

    }
}
