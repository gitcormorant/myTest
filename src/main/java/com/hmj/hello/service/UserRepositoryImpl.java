package com.hmj.hello.service;

import com.hmj.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2019-09-16-15:34
 */

@Component
public class UserRepositoryImpl implements UserRepository  {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }
}
