package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewSearchForItems {
    @FXML
    private TextField tfSearchForItemItemID;
    @FXML
    private Button btSearchForItemConfirm;
    @FXML
    private Button btSearchForItemBack;
    @FXML
    private Label itemFound;

    public void objectFound(ActionEvent event) throws IOException {
        checkitemID();
    }
    private void checkitemID() throws IOException{
        App m = new App();
        if(tfSearchForItemItemID.getText().toString().equals("1")){
            itemFound.setText("ItemFound!");

            m.changeScene("viewDeliverItems.fxml");
        }
        else if(tfSearchForItemItemID.getText().isEmpty()){
            itemFound.setText("Please enter object ID.");
        }
        else{
            itemFound.setText("Item not found.");
        }
    }
    public void backView1(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("view1.fxml");
    }
}
