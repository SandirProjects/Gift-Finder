package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInController 
{
	@FXML
	private TextField username;
	private String userID = "";
	@FXML
	private PasswordField password;
	private String passID = "";
	private SceneController scenecontrol = new SceneController();	

	
	@FXML
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
					UPModel.userID = this.userID;
					try {scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
					return;
				}
			}
		}
	}
	@FXML
	public void signIn(ActionEvent event)
	{
		userID = username.getText();
		passID = password.getText();
		boolean usercheck = SignInModel.processUser(userID, passID);
		if(usercheck == true)
		{
			try{scenecontrol.startUserProfile(event);}catch(Exception e){e.printStackTrace();}
			userID = "";
			passID = "";
		}
		else
		{
			try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
			passID = "";
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
