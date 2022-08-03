package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import models.UPModel;

public class AccountController {
	
	@FXML
	private MenuItem signout;
	@FXML
	private Label acctusername;
	@FXML
	private Button cusername;
	@FXML
	private Button cpassword;
	@FXML
	private Button exit;
	private SceneController scenecontroller = new SceneController();
	
	@FXML
	public void initialize()
	{
		String userID = UPModel.userID;
		acctusername.setText(userID);
		acctusername.setTextFill(Color.BLUE);
	}
	
	@FXML
	public void changeUsername(ActionEvent event) throws IOException
	{
		scenecontroller.startCNUN(event);
	}
	@FXML
	public void changePassword(ActionEvent event) throws IOException
	{
		scenecontroller.startCNPW(event);
	}
	@FXML
	public void exit(ActionEvent event) throws IOException
	{
		scenecontroller.startUserProfile(event);
	}
	
	@FXML
	public void processSignOut(ActionEvent event)
	{
		
		try{scenecontroller.newSignInPage(event, signout);}catch(Exception e){e.printStackTrace();}
	}
}
