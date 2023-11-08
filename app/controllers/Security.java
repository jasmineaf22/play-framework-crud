package controllers;
import models.User;

public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        User x = User.find("username = ?1 and password = ?2", username, password).first();
        return x != null;
    }
}
