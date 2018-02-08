package main;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class AlertBox {
	private AlertBox() {}
	public static Optional<ButtonType> showAndWait(
			AlertType alertType, 
			String title,
			String content) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		alert.setResizable(true);
		return alert.showAndWait();			
	}
}
