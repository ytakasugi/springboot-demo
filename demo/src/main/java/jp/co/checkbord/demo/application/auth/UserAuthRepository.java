package jp.co.checkbord.demo.application.auth;

public interface UserAuthRepository {
    void createUser(String userName, String password);
}
