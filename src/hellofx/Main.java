package hellofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Button btnInserir = new Button("Inserir");
        Button btnAlterar = new Button("Alterar");
        Button btnExcluir = new Button("Excluir");
        Button btnBuscar = new Button("Buscar");
        Button btnListar = new Button("Listar");
        Button btnBuscarCep = new Button("Buscar CEP");

        btnInserir.setOnAction(e -> new InserirLogradouroView().show(new Stage()));
        btnAlterar.setOnAction(e -> new AlterarLogradouroView().show(new Stage()));
        btnExcluir.setOnAction(e -> new ExcluirLogradouroView().show(new Stage()));
        btnBuscar.setOnAction(e -> new BuscarLogradouroView().show(new Stage()));
        btnListar.setOnAction(e -> new ListarLogradouroView().show(new Stage()));
        btnBuscarCep.setOnAction(e -> new BuscarCepView().show(new Stage()));

        FlowPane layout = new FlowPane(10, 10, btnInserir, btnAlterar, btnExcluir, btnBuscar, btnListar, btnBuscarCep);
        layout.setPadding(new Insets(15));
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Menu Logradouro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}