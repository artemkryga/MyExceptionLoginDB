package ua.kryha.model.entity;

import java.sql.SQLException;

public class MyException extends SQLException {
    String login;

    public MyException(String reason, String login) {
        super(reason);
        this.login = login;
    }
}
