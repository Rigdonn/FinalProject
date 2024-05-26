package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewReportLostObject {
    @FXML
    private TextField tfReportLObjectID;
    @FXML
    private TextField tfReportLObjectName;
    @FXML
    private TextField tfReportLObjectDate;
    @FXML
    private Button btReportLObjectConfirm;
    @FXML
    private Button btReportLObjectBack;
    @FXML
    private Label newObjectConfirm;

    public void confirmReportLostObject(ActionEvent event) throws IOException {
        newObjectConfirm.setText("New object added!");
    }
    public void backReportLostObject(ActionEvent event) throws IOException{
        App m = new App();
        m.changeScene("view1.fxml");
    }

}
