package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class FriendController {

	@FXML
	private MenuItem remove;
	@FXML
	private MenuItem add;
	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	private SceneController scenecontroller = new SceneController();
	
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
}
