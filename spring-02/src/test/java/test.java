import com.ming.dao.UserDaoCImpl;
import com.ming.dao.UserDaoJavaImpl;
import com.ming.service.UserService;
import com.ming.service.UserServiceImpl;
import org.junit.Test;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class test {
    @Test
    public void test(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(new UserDaoCImpl());
        service.getUserName();

        service.setUserDao(new UserDaoJavaImpl());
        service.getUserName();

    }
}
