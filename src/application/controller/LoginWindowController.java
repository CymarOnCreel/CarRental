package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginWindowController {

	
	@FXML
	private void switchToSignUpPage(ActionEvent event) {
		//To-DO switching to RegistrationWindow
		System.out.println("switch to sign up");
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/RegisterWindow.fxml"));
			GridPane root = (GridPane) loader.load();
			Scene registrationScene = new Scene(root, 600, 400);
			Stage registrationStage = new Stage();
			registrationStage.setTitle("Registration Window");
			Image img = new Image(getClass().getResourceAsStream("/application/resources/icon.jpg"));
			registrationStage.getIcons().add(img);
			registrationStage.setScene(registrationScene);
			registrationStage.initModality(Modality.APPLICATION_MODAL);
			registrationStage.initOwner(((Node) event.getSource()).getScene().getWindow());
			registrationStage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void loginUser() {
		/* To-Do
		 * check for username and password match in database
		 * check for user type and change to appropriate window
		 * 1. user main window
		 * 2. salesman window
		 * 3. admin window
		 */
		
		System.out.println("login User");
		
		
	}
}
