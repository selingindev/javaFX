package hellofx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AlterarLogradouroView {

    public void show(Stage stage) {
        TextField idField = new TextField();
        idField.setPromptText("ID");

        TextField cepField = new TextField();
        cepField.setPromptText("CEP");

        TextField numeroField = new TextField();
        numeroField.setPromptText("Número");

        TextField complementoField = new TextField();
        complementoField.setPromptText("Complemento");

        Button btnAlterar = new Button("Alterar");

        VBox layout = new VBox(10, idField, cepField, numeroField, complementoField, btnAlterar);
        layout.setPadding(new Insets(15));

        btnAlterar.setOnAction(e -> {
            showMessage("Alterar ID: " + idField.getText());
        });

        stage.setScene(new Scene(layout, 300, 280));
        stage.setTitle("Alterar Logradouro");
        stage.show();
    }

    private void showMessage(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
