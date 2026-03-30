module com.example.auladegit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.auladegit to javafx.fxml;
    exports com.example.auladegit;
}