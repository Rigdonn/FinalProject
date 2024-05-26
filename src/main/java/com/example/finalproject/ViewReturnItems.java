package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewReturnItems {
    @FXML
    private TextField tfReturnItemItemID;
    @FXML
    private Button btReturnItemConfirm;
    @FXML
    private Button btReturnItemBack;
    @FXML
    private Label searchItemConfirm;

    public void confirmSearch(ActionEvent event) throws IOException {
        checkitemID2();
    }
    private void checkitemID2() throws IOException{
        App m = new App();
        if(tfReturnItemItemID.getText().toString().equals("1")){
            searchItemConfirm.setText("ItemFound!");

            m.changeScene("viewReturnItems2.fxml");
        }
        else if(tfReturnItemItemID.getText().isEmpty()){
            searchItemConfirm.setText("Please enter object ID.");
        }
        else{
            searchItemConfirm.setText("Item not found.");
        }
    }
    public void backReturnItems(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("view1.fxml");
    }
}
