package Dao.impl;

import Dao.IUserDao;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DBCPUtil;

import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    private QueryRunner qr= new QueryRunner(DBCPUtil.getDataSource());
    @Override
    public User selectUserByUsername(String username) {
        try {
            return qr.query( "select * from user where username = ?",new BeanHandler<User>(User.class),username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int addUser(User user) {
        try {
            return qr.update( "insert into user (username,password,birthday,hobby, married) values (?,?,?,?,?)",
                    user.getUsername(),user.getPassword(),user.getBirthday(),user.getHobby(),user.isMarried());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
