module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens com.example.finalproject to javafx.fxml;
    exports com.example.finalproject;
}