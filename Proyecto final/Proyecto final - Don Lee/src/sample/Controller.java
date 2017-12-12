package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.awt.*;
import java.util.Optional;

public class Controller {

    public void ordenar (ActionEvent actionEvent) {

    }


    public void salir(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Por fuera");
        alerta.setContentText("Seguro que no tienes hambre");
        alerta.setHeaderText("Te vas!");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            Alert alerta2 = new Alert(Alert.AlertType.CONFIRMATION);
            alerta2.setTitle("Por fuera");
            alerta2.setContentText("Seguro que no tienws hambre");
            alerta2.setHeaderText("Te vas!");
            Optional<ButtonType> resultado2 = alerta.showAndWait();
            if (resultado2.get() == ButtonType.OK) {
                Platform.exit();
            }
        }
    }
}





