package controllers;

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
	
	/*@FXML
	public void processUser(ActionEvent event)
	{
		userID = username.getText();
		passID = password.getText();
		if(userID == "" || passID == "")
		{
			if(userID != "")
			{
				username.setText(userID);
				password.requestFocus();
			}
			else if(passID != "")
			{
				password.setText(passID);
				username.requestFocus();
			}
			return;
		}
		else
		{
			boolean usercheck = SignInModel.findUser(userID);
			if(usercheck == false)
			{
				try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				boolean uservalidate = SignInModel.processUser(userID,passID);
				if(uservalidate == false)
				{
					try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
				}
				else if(uservalidate == true)
				{
					//UPModel.userID = this.userID;
					UserProfileInfo.get(userID).userID = SignInModel.curUsername;
					try {scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
					return;
				}
			}
		}
	}
	
	public boolean processUsername(ActionEvent event)
	{
		userID = username.getText();
		boolean usercheck = SignInModel.findUser(userID);
		
		if (usercheck == false)
			try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
		return usercheck;
	}*/
	
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
			System.out.println(SignInModel.curUsername);
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
	
	
	/*@FXML
	public void signIn(ActionEvent event)
	{
		userID = username.getText();
		passID = password.getText();
		boolean usercheck = SignInModel.processUser(userID, passID);
		if(usercheck == true)
		{
			
			SignInModel.curUsername = userID;
			System.out.println(SignInModel.curUsername);
			try{scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
			userID = "";
			passID = "";
		}
		else
		{
			try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
			passID = "";
		}
	}*/
	@FXML 
	public void createAccount(ActionEvent event)
	{
			userID = "";
			passID = "";
			try {scenecontrol.startCreateAccount(event);}catch(Exception e){e.printStackTrace();}
	}
	
}
