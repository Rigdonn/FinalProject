package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class main {
    @FXML
    public TextField tfMainUser;
    @FXML
    public TextField tfMainPassword;
    @FXML
    public Button btMainLogin;
    @FXML
    public Button btMainRegister;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}