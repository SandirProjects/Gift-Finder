package controllers;
/**
 * This controller handles the view allowing the user to sign in to the application.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.SignInModel;

public class SignInController 
{
	@FXML
	private TextField username;
	private String userID = "";
	@FXML
	private PasswordField password;
	private String passID = "";
	private SceneController scenecontrol = new SceneController();	
	
	public boolean processPassword(ActionEvent event)
	{
		userID = username.getText();
		passID = password.getText();
		boolean uservalidate = SignInModel.processUser(userID,passID);
		
		if(uservalidate == false)
		{
			try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
		}
		else if(uservalidate)
		{
			SignInModel.curUsername = userID;
			try {scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
		}
		return uservalidate;
	}
	
	@FXML
	public void signIn(ActionEvent event)
	{

		boolean passcheck = processPassword(event);
		
		if(passcheck)
		{
			
			SignInModel.curUsername = userID;
			try{scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
			userID = "";
			passID = "";
		}
		else
		{
			try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
			passID = "";
			userID = "";
		}
	}
	
	@FXML 
	public void createAccount(ActionEvent event)
	{
			userID = "";
			passID = "";
			try {scenecontrol.startCreateAccount(event);}catch(Exception e){e.printStackTrace();}
	}
	
}
