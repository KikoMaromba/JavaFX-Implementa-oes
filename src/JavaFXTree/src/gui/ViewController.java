package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTest;

	public void onBtTestAction() {
		Alerts.showAlert("Alert Title", "Alert Header", "n quero trampa lá n porra", AlertType.ERROR);
	}
	
}
