package web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;
import service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User>{
    //定义已个用户的数据模型，由于使用了模型驱动，我们必须自己实例化对象
    private User user = new User();
    private service.IUserService service = new UserServiceImpl();

    public String register() throws Exception {
        //1、根据用户名获取数据库的用户对象
        User dbUser = service.findUserByUsername(user.getUsername());
        //2、判断对象是否存在
            // 2.1、如果存在，则表明用户有了，返回exists的结果视图
        if(dbUser!= null){
            return "exists";
        }
        //3、不存在保存用户信息
        int res = service.register( user );
        //4、如果执行结果大于0
        if(res>0){
            return "success";
        }
        //5、如果不大于0，返回null
        return null;
    }

    @Override
    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
