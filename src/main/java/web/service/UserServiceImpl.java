package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User showUser(long id) {
        return userDao.showUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(long id, User updateUser) {
        userDao.updateUser(id, updateUser);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
