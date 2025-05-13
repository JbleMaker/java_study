package entity;

public class User {
    private String username;
    private String password;
    private String name;
    private String email;
    private int phone;
    private String address;
    private String roles;

    public User(){}

    public User(String username, String password, String email, String name, int phone, String address, String roles){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.roles = roles;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPassword(){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setName(){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public void setEmail(){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhone(){
        this.phone = phone;
    }

    public int getPhone(){
        return this.phone;
    }

    public void setAddress(){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setRoles(){
        this.roles = roles;
    }
    public String getRoles(){
        return this.roles;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
