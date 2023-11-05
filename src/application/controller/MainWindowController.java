package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainWindowController implements Initializable {

	@FXML
	ImageView firstBanner;
	@FXML
	ImageView secondBanner;

	private Image img;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setImagesForBanners("/application/resources/banner.jpg", firstBanner);
		setImagesForBanners("/application/resources/banner2.jpg", secondBanner);

	}

	private void setImagesForBanners(String imagePath, ImageView imageView) {
		img = new Image(getClass().getResourceAsStream(imagePath));
		imageView.setImage(img);
		imageView.setFitHeight(55.0);
	}

	@FXML
	public void switchToLoginWindow(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Login.fxml"));
			GridPane root = (GridPane) loader.load();
			Scene loginScene = new Scene(root, 600, 400);
			Stage loginStage = new Stage();
			loginStage.setTitle("Login/Register");
			img = new Image(getClass().getResourceAsStream("/application/resources/icon.jpg"));
			loginStage.getIcons().add(img);
			loginStage.setScene(loginScene);
			loginStage.initModality(Modality.APPLICATION_MODAL);
			loginStage.initOwner(((Node) event.getSource()).getScene().getWindow());
			loginStage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
