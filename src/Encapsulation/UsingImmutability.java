package Encapsulation;

final class User{
    private final String username;

    User(String username) {
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
}
public class UsingImmutability {
    public static void main(String[] args) {
        User u=new User("aaruu");
        System.out.println(u.getUsername());
    }
}
