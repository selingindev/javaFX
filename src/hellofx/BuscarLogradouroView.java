package hellofx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuscarLogradouroView {

    public void show(Stage stage) {
        TextField cepField = new TextField();
        cepField.setPromptText("CEP");

        Button btnBuscar = new Button("Buscar");

        VBox layout = new VBox(10, cepField, btnBuscar);
        layout.setPadding(new Insets(15));

        btnBuscar.setOnAction(e -> {
            showMessage("Buscar CEP: " + cepField.getText());
        });

        stage.setScene(new Scene(layout, 250, 150));
        stage.setTitle("Buscar Logradouro");
        stage.show();
    }

    private void showMessage(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
