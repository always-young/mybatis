package org.kevin.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.kevin.dao.UserMapper;
import org.kevin.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author kevin lau (双鹰)
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void save(User user) {
        val id = userMapper.insert(user);
        System.out.println("插入后的id为" + id);
    }

    public User findById(Long id) {
        if (id == null) {
            return null;
        }
        return userMapper.getById(id);
    }
}
