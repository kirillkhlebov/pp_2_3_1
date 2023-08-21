package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO = new UserDAOImpl();

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        User user = userDAO.fingUser(id);
        userDAO.deleteUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void updateUser(long id, String firstName, String lastName, byte age) {
        userDAO.updateUser(id, firstName, lastName, age);
    }

    @Override
    public User findUser(long id) {
        return userDAO.fingUser(id);
    }
}
