package com.hmj.hello;

import com.hmj.hello.model.User;
import com.hmj.hello.service.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shkstart
 * @create 2019-09-16-15:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDbTest {

    @Autowired
        private UserRepository userRepository;

    @Test
    public void testSaveUser() throws Exception {
//        User user=new User();
//        user.setAge(19);
//        user.setName("hiha");
//        userRepository.saveUser(user);
    }
}
