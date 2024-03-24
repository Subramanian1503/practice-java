package com.upskillyourself.designpatterns.creational.builder;

import com.upskillyourself.designpatterns.creational.builder.builder.User;

public class Application {

    public static void main(String args[]) {
        User user = new User.UserBuilder("Athi", "roopan")
                .setPhoneNumber("xxxxxxxxxx")
                .setAddress("xxxxxxxxxx")
                .build();
        System.out.println(user.toString());
    }
}
