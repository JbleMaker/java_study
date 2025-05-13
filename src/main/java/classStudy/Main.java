package classStudy;

import java.util.ArrayList;
import java.util.List;

class UserAndAdminRepository{
    List<User> userList = new ArrayList<>();
    private static UserAndAdminRepository instance;

    private UserAndAdminRepository(){};

    static UserAndAdminRepository getInstance(){
        if (instance == null) {
            instance = new UserAndAdminRepository();
        }
        return instance;
    }


    void insert(){
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }

    void delete(){
        userList.remove(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService{
    void addAdmin(){
        UserAndAdminRepository.getInstance().insert();
    }
    void removeAdmin(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService {
    void addUser(){
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class User{
    static String userType = "사용자";
    String username = "";
    String password = "";
}

public class Main {
    public static void main(String[] args) {
        new User().username = "test1";
        new User().password = "1111";

        User u = new User();
        u.username = "test2";
        u.password = "1111";

        User.userType = "ADMIN";
    }
}
