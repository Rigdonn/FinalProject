package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class main {
    @FXML
    private Button buttonLogIn;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button buttonRegister;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }
    private void checkLogin() throws IOException{
        App m = new App();
        if(username.getText().toString().equals("username") && password.getText().toString().equals("123")){
            wrongLogin.setText("Succes!");

            m.changeScene("View1.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogin.setText("Please enter data.");
        }
        else{
            wrongLogin.setText("Wrong username or password.");
        }
    }
    public void userRegister(ActionEvent event) throws IOException{
        App m = new App();
        m.changeScene("viewRegister.fxml");
    }

}