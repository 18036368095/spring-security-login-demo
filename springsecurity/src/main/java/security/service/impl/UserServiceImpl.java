package security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import security.dao.UserDao;
import security.domain.User;
import security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
