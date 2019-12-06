package ua.kryha.controller;

public interface RegexContainer {

    String REGEX_LOGIN = "^[a-z0-9]{8,20}$";

    String REGEX_PASSWORD = "^[0-9]{6,20}$";
}
