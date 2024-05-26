package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class View1 {
    @FXML
    private Button buttonView1SearchItem;
    @FXML
    private Button buttonView1ManageAcc;
    @FXML
    private Button buttonView1ReturnItem;
    @FXML
    private Button buttonView1ReportObject;
    @FXML
    private Button buttonLogOut;

    public void toReportLostObject(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("viewReportLostObject.fxml");
    }
    public void logOut(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("main.fxml");
    }
    public void searchItems(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("viewSearchForItems.fxml");
    }
    public void manageAccounts(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("viewManageAccounts.fxml");
    }
    public void returnItems(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("viewReturnItems.fxml");
    }



}
