package pkg.spring.basic.dao;

import pkg.spring.basic.model.auth.User;

import java.util.List;

/**
 * Created by ArIF on 19-Jun-17.
 */
public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(String userName);
    User getUser(String userName);
    List<User> listUsers();

    String getUserRole(long user_privilegeID);
}
