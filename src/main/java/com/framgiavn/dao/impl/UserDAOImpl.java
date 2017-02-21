package com.framgiavn.dao.impl;

import com.framgiavn.dao.UserDAO;
import com.framgiavn.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by FRAMGIA\duong.van.tien on 21/02/2017.
 *
 */
@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    @Override
    public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List listUsers = session.createCriteria(User.class).list();
        logger.info("--- get listUsers : size = "+listUsers.size());
        return listUsers;
    }
}
