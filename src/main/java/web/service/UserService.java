package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void addUser(String name,String surname, Integer  age);
    void editUser(User user);
    void deleteUser(long id);
    List<User> getAllUsers();
    User getUser(long id);
}
