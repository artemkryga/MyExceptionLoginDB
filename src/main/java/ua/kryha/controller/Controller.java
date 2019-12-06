package ua.kryha.controller;

import ua.kryha.model.db.ConnectionDB;
import ua.kryha.model.entity.MyException;
import ua.kryha.view.View;

import static ua.kryha.model.db.PropertiesDB.*;

import java.util.Scanner;


public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        ConnectionDB connectionDB = new ConnectionDB(DB_URL, DB_USERNAME, DB_PASSWORD);
        InputData inputData = new InputData(view, sc);
        inputData.inputNote();
        try {
            connectionDB.addLoginIntoDB(inputData);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}