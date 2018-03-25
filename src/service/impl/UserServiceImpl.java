package service.impl;

import Dao.IUserDao;
import Dao.impl.UserDaoImpl;
import domain.User;
import service.IUserService;

public class UserServiceImpl implements IUserService {

    private IUserDao dao = new UserDaoImpl();

    @Override
    public User findUserByUsername(String username) {
        return dao.selectUserByUsername(username);

    }

    @Override
    public int register(User user) {
       return dao.addUser(user);
    }


}
