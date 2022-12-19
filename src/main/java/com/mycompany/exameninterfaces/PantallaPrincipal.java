package com.mycompany.exameninterfaces;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.Persona;

public class PantallaPrincipal implements Initializable {

    @FXML
    private ComboBox<String> comboSexo;
    @FXML
    private Spinner<Integer> spEdad;
    @FXML
    private Spinner<Integer> spPeso;
    @FXML
    private Spinner<Integer> spAltura;
    @FXML
    private ComboBox<String> comboActividad;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnAñadir;
    @FXML
    private TableView<Persona> tabla;
    @FXML
    private TableColumn<String, String> cNombre;
    @FXML
    private TableColumn<String, String> cSexo;
    @FXML
    private TableColumn<Integer, Integer> cEdad;
    @FXML
    private TableColumn<Double, Double> cPeso;
    @FXML
    private TableColumn<Double, Double> cAltura;
    @FXML
    private TableColumn<String, String> cActividad;
    @FXML
    private TableColumn<Double, Double> cGER;
    @FXML
    private TableColumn<Double, Double> cGET;
    
    
    @FXML
    private Label info;
    
    Persona personaActual = null;
    ArrayList<Persona> personas = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        llenarCombos();
        

    }
    
    
    
    

    
    
    
    
    
    private void llenarCombos(){
        //comboSexo
        ObservableList<String> listaSexo = FXCollections.observableArrayList();
        listaSexo.add("Hombre");
        listaSexo.add("Mujer");
        comboSexo.setItems(listaSexo);
        
        //comboActividad
        ObservableList<String> tipoActividad = FXCollections.observableArrayList();
        tipoActividad.add("Muy Ligera");
        tipoActividad.add("Ligera");
        tipoActividad.add("Moderada");
        tipoActividad.add("Intensa");
        comboActividad.setItems(tipoActividad);
        
        //rellenarSpinner

        SpinnerValueFactory listaEdad = new IntegerSpinnerValueFactory(18, 99, 0, 1);
        spEdad.setValueFactory(listaEdad);
        
        SpinnerValueFactory listaPeso = new IntegerSpinnerValueFactory(0, 120, 0, 1);
        spPeso.setValueFactory(listaPeso);
        
        SpinnerValueFactory listaAltura = new IntegerSpinnerValueFactory(0, 200, 0, 10);
        spAltura.setValueFactory(listaAltura);
        
        
        
        
        
        
    }
    
     private Persona leerFormulario() {

         String nombre = txtNombre.getText();
         String sexo = comboSexo.getValue();
         Integer edad = spEdad.getValue();
         Integer peso = spPeso.getValue();
         Integer altura = spAltura.getValue();
         String actividad = comboActividad.getValue();
         
   

        if ("".equals(nombre) || "".equals(sexo) || edad == 0
            || peso == 0 || altura == 0 || "".equals(actividad)) {
            info.setText("Faltan Datos");
            info.setStyle("-fx-background-color:red; -fx-text-fill:white;");
            return null;
        } else {
            Persona p = new Persona();

            p.setNombre(nombre);
            p.setSexo(sexo);
            p.setEdad(edad);
            p.setPeso(peso);
            p.setAltura(peso);
            p.setActividad(actividad);
           
            return p;
        }
    }

    @FXML
    private void añadirPersona(ActionEvent event) {
        
        personaActual = leerFormulario();
        personas.add(personaActual);
        System.out.println(personas.toString());
        
        
        
        
    }

    
    
    
}
