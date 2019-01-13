import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import security.SpringSecurityApplication;
import security.domain.User;
import security.service.UserService;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringSecurityApplication.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUser() {
        User user = userService.findUserByName("uzck");
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getRoles());
    }

    @Test
    public void printPassword() {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
