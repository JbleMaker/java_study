package oop;

public class Main {
    public static void main(String[] args) {
        // 의존성 주입,
//        UserRepository userRepository = new BasicUserRepository();
        BasicUserService userService = new BasicUserService(new BasicUserRepository());
        userService.addUser();
    }
}

/*
    업,다운캐스팅, oop
*/