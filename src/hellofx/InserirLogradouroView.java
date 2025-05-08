package hellofx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InserirLogradouroView {

    public void show(Stage stage) {
        TextField cepField = new TextField();
        cepField.setPromptText("CEP");

        TextField numeroField = new TextField();
        numeroField.setPromptText("Número");

        TextField complementoField = new TextField();
        complementoField.setPromptText("Complemento");

        Button btnInserir = new Button("Inserir");

        VBox layout = new VBox(10, cepField, numeroField, complementoField, btnInserir);
        layout.setPadding(new Insets(15));

        btnInserir.setOnAction(e -> {
            String cep = cepField.getText();
            String numero = numeroField.getText();
            String complemento = complementoField.getText();

            showMessage("Inserir: " + cep + ", " + numero + ", " + complemento);
        });

        stage.setScene(new Scene(layout, 300, 250));
        stage.setTitle("Inserir Logradouro");
        stage.show();
    }

    private void showMessage(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
