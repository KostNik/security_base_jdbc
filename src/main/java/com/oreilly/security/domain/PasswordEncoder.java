package com.oreilly.security.domain;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args) {
//        ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder();
        StandardPasswordEncoder shaPasswordEncoder = new StandardPasswordEncoder();
        String password = shaPasswordEncoder.encode("password");
        System.out.println(password);
    }
}
