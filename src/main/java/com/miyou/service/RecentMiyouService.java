package com.miyou.service;

import weibo4j.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenxiaojian
 * Date: 13-3-9
 * Time: 上午12:17
 * To change this template use File | Settings | File Templates.
 */
public interface RecentMiyouService {

    public List<User> getMutualFriendsByCount(String currentUserId, int count);

}
