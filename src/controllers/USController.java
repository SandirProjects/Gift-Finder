 package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class USController {

	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	@FXML
	private Button exit;
	
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
	
	@FXML
	public void exit(ActionEvent event) throws IOException
	{
		scenecontroller.startUserProfile(event);
	}
}
