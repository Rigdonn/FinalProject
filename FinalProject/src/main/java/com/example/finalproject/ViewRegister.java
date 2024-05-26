package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewRegister {
    @FXML
    private TextField tfRegisterName;
    @FXML
    private TextField tfRegisterDNI;
    @FXML
    private TextField tfRegisterPhoneN;
    @FXML
    private TextField tfRegisterEmail;
    @FXML
    private Button btRegisterConfirm;
    @FXML
    private Button btRegisterBack;

    public void confirm(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("main.fxml");
    }
    public void backRegister(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("main.fxml");
    }
}
