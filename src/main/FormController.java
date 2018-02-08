package main;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FormController {

	@FXML
	TextField amountTextField;
	@FXML
	TextField interestTextField;
	@FXML
	TextField periodTextField;
	@FXML
	Label montlyPaymentLabel;
	@FXML
	Button btnCalc;
	double amount;
	double interest;
	double period;
	double montlyPayment;

	@FXML
	private void initialize() {
	}

	@FXML
	private void calculate() {

		amount = Double.parseDouble(amountTextField.getText());
		interest = convertToMonthlyInterest(Double.parseDouble(interestTextField.getText()));
		int period = yearsToMonths(Integer.parseInt(periodTextField.getText()));
		montlyPayment = (double) (((interest * amount) * Math.pow(1 + interest, period))
				/ Math.pow((1 + interest), period) - 1);
		montlyPaymentLabel.setText(Long.toString(Math.round(montlyPayment)));
	}

	private int yearsToMonths(int years) {
		return (12 * years);
	}

	private double convertToMonthlyInterest(double interest) {
		return (interest / 12) / 100;
	}

}
