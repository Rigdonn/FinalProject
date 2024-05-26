package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.io.IOException;

public class ViewManageAccounts {
    @FXML
    private TableColumn tableViewID;
    @FXML
    private TableColumn tableViewName;
    @FXML
    private TableColumn tableViewPhoneNumber;
    @FXML
    private TableColumn tableViewEmail;
    @FXML
    private TableColumn tableViewAddres;
    @FXML
    private TableColumn tableColumnBack;
    @FXML
    private Button backManage;
    public void backToView1(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("view1.fxml");
    }
}
