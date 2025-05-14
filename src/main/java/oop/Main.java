package oop;

public class Main {
    public static void main(String[] args) {

        BasicUserService userService = new BasicUserService(new BasicUserRepository());
        userService.addUser();
    }
}