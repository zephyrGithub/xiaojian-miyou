package com.miyou.controller;

import com.miyou.service.RecentMiyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import weibo4j.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenxiaojian
 * Date: 13-3-9
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/miyou")
public class RecentMiyouController {

    private final int INTIMACY = 5; //亲密朋友

    private final int HALFINTIMACY = 9; //半熟朋友

    @Autowired
    RecentMiyouService recentMiyouService;


    @RequestMapping(value = "/user/{uid}")
    public ModelAndView getIntimacyFriends(@PathVariable("uid") String uid, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        String currentUserId = uid;
        long start = System.currentTimeMillis();
        List<User> friendList = recentMiyouService.getMutualFriendsByCount(currentUserId, INTIMACY + HALFINTIMACY);
        System.out.println("耗费时间： " + (System.currentTimeMillis() - start));
        List<User> intimacyFriendList = null;
        List<User> halfIntimacyFriendList = null;
        if (friendList != null) {
            intimacyFriendList = friendList.subList(0, friendList.size() > INTIMACY ? INTIMACY : friendList.size());
            if (friendList.size() > INTIMACY) {
                halfIntimacyFriendList = friendList.subList(INTIMACY, friendList.size() > INTIMACY + HALFINTIMACY ? INTIMACY + HALFINTIMACY : friendList.size());
            }
        }
        modelAndView.addObject("intimacyFriendList", intimacyFriendList);
        modelAndView.addObject("halfIntimacyFriendList", halfIntimacyFriendList);
        modelAndView.setViewName("miyou/friends");
        return modelAndView;
    }


}
