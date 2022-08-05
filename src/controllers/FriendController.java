package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import models.FriendModel;
import models.UPModel;

public class FriendController {

	@FXML
	private MenuItem unfollow;
	@FXML
	private MenuItem follow;
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
	public void exit(ActionEvent event)
	{
		try{scenecontroller.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
	}
	
	@FXML 
	public void processFollow(ActionEvent event)
	{
		if (!UPModel.friends.contains(friend.getText()))
			UPModel.friends.add(friend.getText());
	}
	
	@FXML 
	public void processUnfollow(ActionEvent event)
	{
		if (UPModel.friends.contains(friend.getText()))
			UPModel.friends.remove(friend.getText());
	}
}
