import com.xianxain.day01.BeanFactory;
import com.xianxain.day01.User;
import com.xianxain.day01.UserService;
import com.xianxain.day01.UserServiceImpl;
import org.junit.Test;

public class TestSpring {
    /**
     * 用于测试:工厂进行解耦合的操作
     */
    @Test
    public void test(){
//        UserService userService=new UserServiceImpl();//耦合

        UserService userService= BeanFactory.getUserService(); //解耦合

        userService.login("name","suns");

        User user=new User("suns","123456");
        userService.register(user);
    }
}
