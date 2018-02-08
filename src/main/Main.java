package main;

import java.util.Optional;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane borderPane = new BorderPane();
		FXMLLoader viewLoader = new FXMLLoader(getClass().getResource("Form.fxml"));
		BorderPane bp = viewLoader.load();
		borderPane.setCenter(bp);
		
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Formularz");
		primaryStage.setResizable(true);
		primaryStage.setWidth(600);
		primaryStage.setHeight(400);
//		primaryStage.setOnCloseRequest(e -> primaryStage_CloseRequest(e));
		primaryStage.show();

	}


}
