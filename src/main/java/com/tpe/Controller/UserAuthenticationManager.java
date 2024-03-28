package com.tpe.Controller;

import java.util.HashMap;
import java.util.Map;

public class UserAuthenticationManager {
    private Map<String, String> users;
    // Kullanıcı adı ve şifre eşleştirmelerini saklayan bir map

    public UserAuthenticationManager() {
        this.users = new HashMap<>();
    }

    public boolean register(String firstName, String lastName, String username, String password) {
        if (users.containsKey(username)) {
            return false; // Kullanıcı adı zaten kullanılıyor
        }

        String fullName = firstName + " " + lastName;
        users.put(username, password);

        System.out.println("Yeni kullanıcı kaydedildi:");
        System.out.println("Adı Soyadı: " + fullName);
        System.out.println("Kullanıcı Adı: " + username);

        return true;
    }
    public boolean usernameExists(String username) {
        return users.containsKey(username);
    }
}
