package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Cymar Car Rental");
			Image image=new Image("/application/resources/icon.jpg");
			primaryStage.getIcons().add(image);
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/application/view/MainWindow.fxml"));
			Scene scene = new Scene(root, 800, 600);
			scene.getStylesheets().add(getClass().getResource("/application/view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
/* To-Do
 * Build Login window
 * Build Registration window
 * Build profile update window
 * Build salesman add car window
 * Build admin window to add remove users/salesmans
 * Build a rental procedure page
 * create some dummy data in databases 
 * build the database operations CRUD
 * Create login controller and methods
 * create profile update controller
 * create registration controller
 * Create Salesman controller
 * Create Admin Controller
 * Create User Controller
 * 
 * 
 * */
