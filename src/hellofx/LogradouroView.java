package hellofx;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class LogradouroView {

    public Scene createScene() {
        // Layout principal
        VBox layout = new VBox(10);

        // Título da janela
        Label title = new Label("Gerenciamento de Logradouros");

        // Campos de entrada (não são usados ainda, mas podem ser usados para pegar dados)
        TextField cepField = new TextField();
        cepField.setPromptText("Digite o CEP");
        
        TextField numeroField = new TextField();
        numeroField.setPromptText("Digite o Número");
        
        TextField complementoField = new TextField();
        complementoField.setPromptText("Digite o Complemento");

     
        Button btnInserir = new Button("Inserir");
        Button btnAlterar = new Button("Alterar");
        Button btnBuscar = new Button("Buscar");
        Button btnExcluir = new Button("Excluir");
        Button btnListar = new Button("Listar");
        Button btnBuscarCep = new Button("Informações CEP");

        // Configurar as ações dos botões
        btnInserir.setOnAction(e -> showMessage("Inserir logradouro clicado"));
        btnAlterar.setOnAction(e -> showMessage("Alterar logradouro clicado"));
        btnBuscar.setOnAction(e -> showMessage("Buscar logradouro clicado"));
        btnExcluir.setOnAction(e -> showMessage("Excluir logradouro clicado"));
        btnListar.setOnAction(e -> showMessage("Listar logradouros clicado"));
        btnBuscarCep.setOnAction(e -> showMessage("Buscar CEP clicado"));

        // Organizando os botões em um FlowPane (que quebra automaticamente quando não há espaço suficiente)
        FlowPane buttonLayout = new FlowPane();
        buttonLayout.setHgap(10); // Espaçamento horizontal entre os botões
        buttonLayout.setVgap(10); // Espaçamento vertical entre as linhas de botões
        buttonLayout.getChildren().addAll(
                btnInserir, btnAlterar, btnBuscar, btnExcluir, btnListar, btnBuscarCep
        );

        // Adicionando os componentes ao layout principal
        layout.getChildren().addAll(
                title, cepField, numeroField, complementoField, buttonLayout
        );

        // Configuração da cena
        Scene scene = new Scene(layout, 400, 300);
        return scene;
    }

    private void showMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}