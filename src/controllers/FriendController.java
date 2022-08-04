package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import models.FriendModel;

public class FriendController {

	@FXML
	private MenuItem remove;
	@FXML
	private MenuItem add;
	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	@FXML
	private Button exit;
	@FXML
	private Label friend;
	private SceneController scenecontroller = new SceneController();
	
	@FXML
	public void initialize()
	{
		friend.setText(FriendModel.userID);
		friend.setTextFill(Color.BLUE);
	}
	
	@FXML
	public void processSignOut(ActionEvent event)
	{
		
		try{scenecontroller.newSignInPage(event, signout);}catch(Exception e){e.printStackTrace();}
	}
	
	@FXML 
	public void processAccount(ActionEvent event)
	{
		try{scenecontroller.startAccount(event, account);}catch(Exception e){e.printStackTrace();}
	}
	
	@FXML
	public void exit(ActionEvent event) throws IOException
	{
		scenecontroller.startUserProfile(event);
	}
	
}
