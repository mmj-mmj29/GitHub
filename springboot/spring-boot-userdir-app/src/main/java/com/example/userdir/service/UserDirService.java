package com.example.userdir.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class UserDirService {

    private static final String USER_HOME_PREFIX = "/opt/user/";

    public boolean createUserHome(String userId) {
        File userHome = new File(USER_HOME_PREFIX + userId);
        if (!userHome.exists()) {
            return userHome.mkdirs();
        }
        return false; // already exists
    }
}