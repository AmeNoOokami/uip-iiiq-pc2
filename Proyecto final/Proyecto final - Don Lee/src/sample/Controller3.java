package sample;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Optional;

public class Controller3 {

    @FXML
    Button ordenar;
    @FXML
    Button agregar;

    public void ordenar (ActionEvent actionEvent) {
        Stage stage = (Stage) ordenar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("Llama al lapecillo de sistemas.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
            alerta2.setContentText("Seguro que no tienes hambre");
            alerta2.setHeaderText("Te vas!");
            Optional<ButtonType> resultado2 = alerta.showAndWait();
            if (resultado2.get() == ButtonType.OK) {
                Platform.exit();
            }
        }
    }

}





