package org.geektimes.projects.user.repository;

import org.geektimes.projects.user.domain.User;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * 用户存储仓库
 *
 * @since 1.0
 */
public interface UserRepository {

    boolean save(User user) throws SQLException;

    boolean deleteById(Long userId);

    boolean update(User user);

    User getById(Long userId);

    User getByName(String userName);

    User getByNameAndPassword(String userName, String password);

    Collection<User> getAll();
}
