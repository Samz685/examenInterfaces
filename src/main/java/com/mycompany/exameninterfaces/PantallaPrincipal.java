package com.mycompany.exameninterfaces;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PantallaPrincipal {

    @FXML
    private ComboBox<?> comboSexo;
    @FXML
    private Spinner<?> spEdad;
    @FXML
    private Spinner<?> spPeso;
    @FXML
    private Spinner<?> spAltura;
    @FXML
    private ComboBox<?> comboActividad;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnAñadir;
    @FXML
    private TableView<?> tabla;
    @FXML
    private TableColumn<?, ?> cNombre;
    @FXML
    private TableColumn<?, ?> cSexo;
    @FXML
    private TableColumn<?, ?> cEdad;
    @FXML
    private TableColumn<?, ?> cPeso;
    @FXML
    private TableColumn<?, ?> cAltura;
    @FXML
    private TableColumn<?, ?> cActividad;
    @FXML
    private TableColumn<?, ?> cGER;
    @FXML
    private TableColumn<?, ?> cGET;

    @FXML
    private void seleccionarEmpresa(MouseEvent event) {
    }

    
    
    
}
