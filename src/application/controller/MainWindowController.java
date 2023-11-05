package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainWindowController implements Initializable{

	@FXML
	ImageView firstBanner;
	@FXML
	ImageView secondBanner;
	
	@FXML
	public void login(ActionEvent event) {
		System.out.println("Login buton pushed");
	}
	
	private Image img;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		setImagesForBanners("/application/resources/banner.jpg", firstBanner);
		setImagesForBanners("/application/resources/banner2.jpg", secondBanner);
			
	}
	
	private void setImagesForBanners(String imagePath, ImageView imageView) {
		img=new Image(getClass().getResourceAsStream(imagePath));
		imageView.setImage(img);
		imageView.setFitHeight(55.0);
		
	}
}
