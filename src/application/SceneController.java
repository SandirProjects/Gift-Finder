package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node node;
	
	
	@FXML
	public void ErrorPopup1(ActionEvent event) throws IOException
	{	
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/Error1.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void ErrorPopup2(ActionEvent event) throws IOException
	{	
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/Error2.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void ErrorPopup3(ActionEvent event) throws IOException
	{	
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/Error3.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void startUserProfile(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/UserProfile.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void startCreateAccount(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/CreateAccount.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void startSignInPage(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/SignIn.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void newSignInPage() throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/SignIn.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}