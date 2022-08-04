 package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import models.FriendModel;
import models.UserSearchModel;

public class UserSearchController {

	private UserSearchModel model = new UserSearchModel();
	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	@FXML
	private Button exit;
	@FXML
	private Button find;
	@FXML
	private TextField user;
	@FXML
	private Label foundUser;
	@FXML
	private Hyperlink friendLink;
	private String userEntered;
	
	
	private SceneController scenecontroller = new SceneController();
	@FXML
	public void initialize()
	{
		foundUser.setText(model.toString());
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
	
	@FXML
	public void processSearch(ActionEvent event)
	{
		userEntered = user.getText();
	}
	
	@FXML
	public void processFind(ActionEvent event)
	{
		processSearch(event);
		friendLink.setVisible(false);
		if (model.findUsers(userEntered) != "")
		{
			foundUser.setText("");
			friendLink.setVisible(true);
			friendLink.setText(userEntered);
			FriendModel.userID = userEntered;
		}
			
		else
			foundUser.setText("Username not found, please try again\n");
	}
	
	@FXML
	public void processFoundUser(ActionEvent event)
	{
		try {scenecontroller.startFriendProfile(event);} catch (IOException e) {e.printStackTrace();}
	}
}
