package application;
	
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class SignInMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/SignIn.fxml"));
			Scene scene = new Scene(root,1200,900);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Category reader = new Category();
		try {
			reader.categoryReader("Electronics", "Resources/Electronics.txt");
			reader.categoryReader("Jewelry", "Resources/Jewelry.txt");
			reader.categoryReader("Kitchen", "Resources/Kitchen.txt");
			reader.categoryReader("LawnGarden", "Resources/LawnGarden.txt");
			reader.categoryReader("Men", "Resources/MenApparel.txt");
			reader.categoryReader("Pet", "Resources/Pet.txt");
			reader.categoryReader("Snacks", "Resources/Snacks.txt");
			reader.categoryReader("Sports", "Resources/Sports.txt");
			reader.categoryReader("Tools", "Resources/Tools.txt");
			reader.categoryReader("Toys", "Resources/Toys.txt");
			reader.categoryReader("VideoGames", "Resources/VideoGames.txt");
			reader.categoryReader("Women", "Resources/WomenApparel.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		launch(args);
	}
}
