package com.adatech.adatechuserregistrationexercise.factories;

import com.adatech.adatechuserregistrationexercise.service.UserService;

public class SingletonUserServiceFactory {
    private static UserService userService = new UserService();

    public static UserService getUserService() {
        return userService;
    }
}
