package com.hmj.hello.mapper;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2019-09-09-21:56
 */
@Component
public interface UserMapper {

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}
