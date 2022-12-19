module com.mycompany.exameninterfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.exameninterfaces to javafx.fxml;
    exports com.mycompany.exameninterfaces;
}
