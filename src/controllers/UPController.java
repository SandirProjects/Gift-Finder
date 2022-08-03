package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
//import models.UPModel;

public class UPController {
	
	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	@FXML
	private Button search;
	@FXML
	private Button editInterests;
	@FXML
	private Label USERNAME;
	private SceneController scenecontroller = new SceneController();
	
	
	@FXML
	public void initialize()
	{
		//String userID = UPModel.userID;
		USERNAME.setText("My Interests");
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
	public void processEditInterests(ActionEvent event)
	{
		try{scenecontroller.startChooseInterests(event);}catch(Exception e){e.printStackTrace();}
	}
	
	@FXML 
	public void processSearchFriends(ActionEvent event)
	{
		try{scenecontroller.startUserSearch(event);}catch(Exception e){e.printStackTrace();}
	}
	
}
