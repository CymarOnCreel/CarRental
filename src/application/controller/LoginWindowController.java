package application.controller;

import javafx.fxml.FXML;

public class LoginWindowController {

	
	@FXML
	private void switchToSignUpPage() {
		//To-DO switching to RegistrationWindow
		System.out.println("switch to sign up");
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
