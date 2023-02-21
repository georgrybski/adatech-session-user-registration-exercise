package com.adatech.adatechuserregistrationexercise.service;

import com.adatech.adatechuserregistrationexercise.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImprovisedEnumInjector {
    USER_SERVICE(new UserService());

    private UserService userService;
}
