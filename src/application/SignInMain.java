package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

//TEST
//TEST2
//TEST3
public class SignInMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
	
			Parent root = FXMLLoader.load(getClass().getResource("/application/SignInMain.fxml"));
			Scene scene = new Scene(root,1920,1020);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
