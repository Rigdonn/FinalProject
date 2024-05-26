package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ViewReturnItems2 {
    @FXML
    private Button btReturnItem2SendItem;
    @FXML
    private Button btReturnItem2SendNot;
    @FXML
    private Button btReturnItem2DeleteItem;
    @FXML
    private Button btReturnItem2Back;
    @FXML
    private Label notificationUpdate;
    @FXML
    private Label deleteUpdate;
    @FXML
    private Label sendItemText;

    public void sendNotification(ActionEvent event) throws IOException {
        notificationUpdate.setText("Notification Sent");
        deleteUpdate.setText("");
        sendItemText.setText("");
    }
    public void deleteItem(ActionEvent event) throws IOException {
        deleteUpdate.setText("Item deleted from DataBase");
        notificationUpdate.setText("");
        sendItemText.setText("");
    }
    public void sendItem(ActionEvent event) throws IOException {
        sendItemText.setText("Delivering item");
        notificationUpdate.setText("");
        deleteUpdate.setText("");
    }
    public void backReturnItems(ActionEvent event) throws IOException {
        App m = new App();

        m.changeScene("viewReturnItems.fxml");
    }


}
