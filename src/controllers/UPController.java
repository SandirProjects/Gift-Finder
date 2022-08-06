package controllers;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import models.SignInModel;
import models.UPModel;

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
	@FXML
	private Label friends;
	@FXML
	private Label interests;
	private SceneController scenecontroller = new SceneController();
	private HashMap<String, UPModel> UserProfileInfo = SignInModel.UserProfileInfo;
	private String curUser = SignInModel.curUsername;
	
	
	@FXML
	public void initialize()
	{
		USERNAME.setText("My Interests");
		if (UserProfileInfo.get(curUser).friends.isEmpty())
			friends.setText("You are not follwoing anyone :(");
		else
			friends.setText(UserProfileInfo.get(SignInModel.curUsername).friendsToString());
		
		if(UserProfileInfo.get(curUser).interests.isEmpty())
			interests.setText("You have not added any interests :(");
		else
			interests.setText(UserProfileInfo.get(curUser).interestsToString());
		
	}
	@FXML
	public void processSignOut(ActionEvent event)
	{
		curUser = "";
		interests.setText("");
		friends.setText("");
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
		UserProfileInfo.get(curUser).interests.clear();
		try{scenecontroller.startChooseInterests(event);}catch(Exception e){e.printStackTrace();}
		try{scenecontroller.closeCurrent(event);}catch(Exception e){e.printStackTrace();}
		try{scenecontroller.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
		
	}
	
	@FXML 
	public void processSearchFriends(ActionEvent event)
	{
		try{scenecontroller.startUserSearch(event);}catch(Exception e){e.printStackTrace();}
	}
	
}
