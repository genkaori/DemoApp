package com.framgiavn.controller;

import com.framgiavn.bussiness.UserBussiness;
import com.framgiavn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by FRAMGIA\duong.van.tien on 21/02/2017.
 *
 */
@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserBussiness userBussiness;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public ModelAndView honePage() {
        ModelAndView model = new ModelAndView();
        List<User> listUsers = userBussiness.listUsers();
        System.out.println("listUsers size : "+listUsers.size());
        model.setViewName("index");
        return model;
    }
}
