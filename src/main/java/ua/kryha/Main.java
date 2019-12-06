package ua.kryha;

import ua.kryha.controller.Controller;
import ua.kryha.model.entity.Account;
import ua.kryha.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new View());

        controller.processUser();
    }
}