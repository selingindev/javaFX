package hellofx;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ListarLogradouroView {

    public void show(Stage stage) {
        TextField cepField = new TextField();
        cepField.setPromptText("CEP");

        Button btnListar = new Button("Listar");

        VBox layout = new VBox(10, cepField, btnListar);
        layout.setPadding(new Insets(15));

        btnListar.setOnAction(e -> {
            showMessage("Listar CEP: " + cepField.getText());
        });

        stage.setScene(new Scene(layout, 250, 150));
        stage.setTitle("Listar Logradouros");
        stage.show();
    }

    private void showMessage(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}