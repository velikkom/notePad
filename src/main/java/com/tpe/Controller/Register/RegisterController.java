package com.tpe.Controller.Register;

import java.util.Scanner;

public class RegisterController {
    private Scanner scanner;
    private UserAuthenticationManager authManager;

    public RegisterController() {
        this.scanner = new Scanner(System.in);
        this.authManager = new UserAuthenticationManager();
        // Kullanıcı kimlik doğrulamasını sağlayan sınıf
    }

    public void startRegister() {
        System.out.println("Not Defteri Uygulaması - Kayıt Ol");
        System.out.print("Adı: ");
        String firstName = scanner.nextLine();
        System.out.print("Soyadı: ");
        String lastName = scanner.nextLine();
        System.out.print("Kullanıcı Adı: ");
        String username = scanner.nextLine();

        // Kullanıcı adı daha önce kullanılmış mı kontrol et
        if (authManager.usernameExists(username)) {
            System.out.println("Bu kullanıcı adı zaten kullanılıyor. Lütfen farklı bir kullanıcı adı seçin.");
            return;
        }

        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z]).{8,}$")) {
            System.out.println("Şifre 8 karakterden uzun olmalı ve büyük harf ve küçük harf içermelidir.");
            return;
        }

        if (authManager.register(firstName, lastName, username, password)) {
            System.out.println("Kayıt başarılı! Giriş yapabilirsiniz.");
        } else {
            System.out.println("Kayıt başarısız. Lütfen tekrar deneyin.");
        }
    }
}
