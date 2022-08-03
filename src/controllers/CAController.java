package controllers;

import application.FileInteract;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.CAModel;

public class CAController {
	
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private PasswordField confirmpass;
	private CAModel model = new CAModel();
	private SceneController scenecontrol = new SceneController();
	String userID = "";
	String passID = "";
	String confpassword = "";
	FileInteract fileinteract = new FileInteract();
	
	@FXML
	public void allowConfirmPW()
	{
		confirmpass.setVisible(true);
		confirmpass.requestFocus();
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
			if(usercheck == true)
			{
				try {scenecontrol.ErrorPopup3(event);}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				allowConfirmPW();
			}
		}
	}
	@FXML
	public void processConfirmPass(ActionEvent event)
	{
		confpassword = confirmpass.getText();
		{
			if(passID.compareTo(confpassword) == 0) 
			{
				model.addUser(userID, confpassword);
				userID = "";
				passID = "";
				confpassword = "";
				
				try{scenecontrol.startChooseInterests(event);}catch(Exception e){e.printStackTrace();}
				try{scenecontrol.startSignInPage(event);}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				try {scenecontrol.ErrorPopup2(event);}catch(Exception e){e.printStackTrace();}
			}
		}
	}
	
	@FXML
	public void processCA(ActionEvent event)
	{
		if(confirmpass.isVisible() == false)
		{
			processUser(event);
		}
		else
		{
			processConfirmPass(event);
		}
	}
	
	
}

