package utils;

import weibo4j.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: chenxiaojian
 * Date: 13-3-10
 * Time: 上午3:10
 * To change this template use File | Settings | File Templates.
 */
public class UserDto {

    private User user;

    private Integer count;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
