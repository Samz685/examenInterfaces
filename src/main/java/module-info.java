module com.mycompany.exameninterfaces {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.exameninterfaces to javafx.fxml;
    exports com.mycompany.exameninterfaces;
}
