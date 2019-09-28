package com.hmj.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-09-11-10:17
 */
@Service
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
//            logger.error("set error: key {}, value {}",key,value,e);
        }
        return result;
    }

    public String get(final String key) {
        String result="";
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            result= (String) operations.get(key);
        } catch (Exception e) {
//            logger.error("set error: key {}, value {}",key,value,e);
        }
        return result;
    }

    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }
}
