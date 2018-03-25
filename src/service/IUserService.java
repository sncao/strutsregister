package service;

import domain.User;

/**
 * 用户相关的业务层窗口
 */
public interface IUserService {
    /**
     * 使用用户名判断用户是否真的存在
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int register(User user);
}
