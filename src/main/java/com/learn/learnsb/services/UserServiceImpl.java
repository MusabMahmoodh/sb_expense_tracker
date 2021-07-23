package com.learn.learnsb.services;

import com.learn.learnsb.domain.User;
import com.learn.learnsb.exceptions.EtAuthException;

public class UserServiceImpl implements UserService{
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
