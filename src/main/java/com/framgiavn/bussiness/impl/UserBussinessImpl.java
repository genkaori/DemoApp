package com.framgiavn.bussiness.impl;

import com.framgiavn.bussiness.UserBussiness;
import com.framgiavn.dao.UserDAO;
import com.framgiavn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by FRAMGIA\duong.van.tien on 21/02/2017.
 *
 */
@Service
public class UserBussinessImpl implements UserBussiness {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.userDAO.listUsers();
    }
}
