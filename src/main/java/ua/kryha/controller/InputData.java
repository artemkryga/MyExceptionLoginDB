package ua.kryha.controller;

import ua.kryha.view.View;

import java.util.Scanner;

import static ua.kryha.controller.RegexContainer.*;
import static ua.kryha.view.TextConstants.*;
public class InputData {
    private View view;
    private Scanner sc;

    private String inputLogin;
    private String inputPassword;

    public InputData(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);

        this.inputLogin = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
        this.inputPassword = utilityController.inputStringValueWithScanner(PASSWORD_DATA, REGEX_PASSWORD);
    }

    public String getInputLogin() {
        return inputLogin;
    }

    public void setInputLogin(String inputLogin) {
        this.inputLogin = inputLogin;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }
}
