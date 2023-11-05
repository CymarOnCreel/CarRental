package application.controller;

import javafx.fxml.FXML;

public class LoginWindowController {

	
	@FXML
	private void switchToSignUpPage() {
		System.out.println("switch to sign up");
	}
	
	@FXML
	private void loginUser() {
		System.out.println("login User");
	}
}
