package com.miyou.controller;

import com.miyou.service.RecentMiyouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    RecentMiyouService recentMiyouService;


    @RequestMapping(value = "/user")
    public ModelAndView getIntimacyFriends(@RequestParam("id") String uid, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        List<User> intimacyFriendList = recentMiyouService.getIntimacyFriends(uid);
        modelAndView.addObject("intimacyFriendList", intimacyFriendList);

        modelAndView.setViewName("miyou/get");
        return modelAndView;
    }


}
