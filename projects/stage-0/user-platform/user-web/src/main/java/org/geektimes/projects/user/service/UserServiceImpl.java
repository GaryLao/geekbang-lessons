package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;

import java.sql.SQLException;

/**
 * 用户服务
 */
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    /**
     * 注册用户
     *
     * @param user 用户对象
     * @return 成功返回<code>true</code>
     */
    @Override
    public boolean register(User user) throws SQLException {
        return userRepository.save(user);
    };

    /**
     * 注销用户
     *
     * @param user 用户对象
     * @return 成功返回<code>true</code>
     */
    public boolean deregister(User user){
        return true;
    };

    /**
     * 更新用户信息
     *
     * @param user 用户对象
     * @return
     */
    public boolean update(User user){
        return true;
    };

    public User queryUserById(Long id){
        return null;
    };

    public User queryUserByNameAndPassword(String name, String password){
        return null;
    };
}
