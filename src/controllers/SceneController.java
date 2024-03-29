package controllers;
/**
 * This controller handles all changes of view for the application.
 */
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error1.fxml"));
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error2.fxml"));
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error3.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void ErrorPopup4(ActionEvent event) throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error4.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void ErrorPopup5(ActionEvent event) throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error5.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	@FXML
	public void ErrorPopup6(ActionEvent event) throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Error6.fxml"));
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/UserProfile.fxml"));
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/CreateAccount.fxml"));
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
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/SignIn.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void newSignInPage(ActionEvent event, MenuItem signout) throws IOException
	{
		Stage stage = (Stage)signout.getParentPopup().getOwnerWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/SignIn.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void startAccount(ActionEvent event, MenuItem account) throws IOException
	{
		Stage stage = (Stage)account.getParentPopup().getOwnerWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/Account.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void startCNPW(ActionEvent event) throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/CNPW.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	public void startCNUN(ActionEvent event) throws IOException
	{
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/CNUN.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	public void closeCurrent(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
	}
	
	@FXML
	public void startChooseInterests(ActionEvent event) throws IOException
	{
		
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/ChooseInterests.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner((Stage)((Node)event.getSource()).getScene().getWindow());
		stage.showAndWait();
	}
	
	@FXML
	public void startUserSearch(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/UserSearch.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void startFriendProfile(ActionEvent event) throws IOException
	{
		this.node = (Node)event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/application/FXMLDocs/FriendProfile.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
