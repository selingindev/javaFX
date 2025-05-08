package hellofx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ExcluirLogradouroView {

    public void show(Stage stage) {
        TextField idField = new TextField();
        idField.setPromptText("ID");

        Button btnExcluir = new Button("Excluir");

        VBox layout = new VBox(10, idField, btnExcluir);
        layout.setPadding(new Insets(15));

        btnExcluir.setOnAction(e -> {
            showMessage("Excluir ID: " + idField.getText());
        });

        stage.setScene(new Scene(layout, 250, 150));
        stage.setTitle("Excluir Logradouro");
        stage.show();
    }

    private void showMessage(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
