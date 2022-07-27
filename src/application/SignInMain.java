package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class SignInMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//TODO 
			//add guest sign in
			//USERPROFILE: add account GUI, add friends list, add search other users, add wishlist
			//add open gift directory button
			//GIFT DIRECTORY: add GUI, add button to open gift directory, add select preference to gift directory
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/SignIn.fxml"));
			Scene scene = new Scene(root,1200,900);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
