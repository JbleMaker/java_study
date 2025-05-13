package oop;

public class CustomUserRepository implements UserRepository {
    public void insert(){
        System.out.println("커스텀 생성자 데이터베이스에 추가");
    }
}
