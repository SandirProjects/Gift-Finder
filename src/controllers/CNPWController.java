package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.CNPWModel;

public class CNPWController {
	
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private PasswordField newpassword;
	@FXML
	private PasswordField confirmpass;
	private CNPWModel model = new CNPWModel();
	private SceneController scenecontrol = new SceneController();
	String userID = "";
	String passID = "";
	String newpass = "";
	String confpassword = "";
	
	
	@FXML
	public void allowConfirmPW()
	{
		confirmpass.setVisible(true);
		confirmpass.requestFocus();
	}
	@FXML
	public void allowNewPW() 
	{
		newpassword.setVisible(true);
		newpassword.requestFocus();
	}
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
			boolean usercheck = model.findUser(userID);
			if(usercheck == false)
			{
				try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				boolean uservalidate = model.processUser(userID, passID);
				if(uservalidate == false)
				{
					try {scenecontrol.ErrorPopup1(event);}catch(Exception e){e.printStackTrace();}
				}
				else if(uservalidate == true)
				{
					allowNewPW();
					passID = "";
				}
			}
		}
	}
	@FXML
	public void processNewPass(ActionEvent event)
	{
		newpass = newpassword.getText();
		allowConfirmPW();
	}
	@FXML
	public void processConfirmPass(ActionEvent event)
	{
		confpassword = confirmpass.getText();
		{
			if(newpass.compareTo(confpassword) == 0)
			{
				model.replaceUserPW(userID, confpassword);
				userID = "";
				passID = "";
				newpass = "";
				confpassword = "";
			}
			else
			{
				try {scenecontrol.ErrorPopup2(event);}catch(Exception e){e.printStackTrace();}
			}
		}
	}
}
