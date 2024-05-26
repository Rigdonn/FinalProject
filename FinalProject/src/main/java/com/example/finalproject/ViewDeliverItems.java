package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewDeliverItems {
    @FXML
    private TextField tfDeliverItemAddres;
    @FXML
    private Button btDeliverItemConfirm;
    @FXML
    private Button btDeliverItemBack;
    @FXML
    private Label confirmedAddres;

    public void confirmAddres(ActionEvent event) throws IOException {
        confirmUserAddres();
    }
    private void confirmUserAddres() throws IOException{
        App m = new App();
        if(tfDeliverItemAddres.getText().toString().equals("calle")){
            confirmedAddres.setText("Addres confirmed!. Item in delivery");

        }
        else if(tfDeliverItemAddres.getText().isEmpty()){
            confirmedAddres.setText("Please enter addres.");
        }
        else {
            confirmedAddres.setText("Invalid addres.");
        }
    }
    public void backDeliverItems(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("viewSearchForItems.fxml");
    }

}
