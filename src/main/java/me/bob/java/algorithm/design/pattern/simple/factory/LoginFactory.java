package me.bob.java.algorithm.design.pattern.simple.factory;

import javax.swing.*;

public class LoginFactory {

    public static Login getLogin(String type) {

        switch (type) {
            case "password":
                return new PasswordLogin();
            case "token":
                return new TokenLogin();
        }
        return new PasswordLogin();
    }
}
