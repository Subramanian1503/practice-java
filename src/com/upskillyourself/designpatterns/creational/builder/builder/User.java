package com.upskillyourself.designpatterns.creational.builder.builder;

public class User {

    private final String firstName;

    private final String lastName;

    private final String address;

    private final String phoneNumber;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.address = userBuilder.address;
        this.phoneNumber = userBuilder.phoneNumber;
    }

    public String toString(){
        return "Name :" + firstName + " " + lastName;
    }

    public static class UserBuilder {

        private final String firstName;

        private final String lastName;

        private String address;

        private String phoneNumber;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    }
}
