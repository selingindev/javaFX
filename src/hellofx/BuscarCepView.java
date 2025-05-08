package hellofx;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuscarCepView {

    public void show(Stage stage) {
        Label lblCep = new Label("Digite o CEP:");
        TextField txtCep = new TextField();
        Button btnBuscar = new Button("Buscar");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(lblCep, txtCep, btnBuscar);

        btnBuscar.setOnAction(e -> {
            String cep = txtCep.getText();
            if (cep.isEmpty()) {
                showMessage("Por favor, insira um CEP.");
                return;
            }

            // Aqui você chamaria o controller real futuramente
            String respostaJsonFake = "{ \"cep\": \"" + cep + "\", \"logradouro\": \"Rua Exemplo\", \"cidade\": \"Cidade Exemplo\" }";
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("Dados do CEP");
            info.setHeaderText("Informações obtidas:");
            info.setContentText(respostaJsonFake);

            ButtonType criar = new ButtonType("Criar");
            ButtonType cancelar = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);
            info.getButtonTypes().setAll(criar, cancelar);

            info.showAndWait().ifPresent(response -> {
                if (response == criar) {
                    // Aqui futuramente chamará controllerLogradouro.customInserir(json)
                    showMessage("Chamaria criação de logradouro com: " + respostaJsonFake);
                }
            });
        });

        stage.setScene(new Scene(layout, 300, 200));
        stage.setTitle("Buscar CEP");
        stage.show();
    }

    private void showMessage(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}