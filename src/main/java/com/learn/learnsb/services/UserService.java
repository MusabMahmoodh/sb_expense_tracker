package com.learn.learnsb.services;

import com.learn.learnsb.domain.User;
import com.learn.learnsb.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
