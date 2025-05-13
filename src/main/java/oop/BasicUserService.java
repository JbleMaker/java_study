package oop;

public class BasicUserService {
    private UserRepository userRepository = new BasicUserRepository();
//    private CustomUserRepository userRepository2 = (CustomUserRepository) userRepository;
//    private BasicUserRepository userRepository2 = (BasicUserRepository) userRepository;

    public BasicUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(){
        System.out.println("기본 사용자 추가");
        userRepository.insert();

    }
}
