package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import models.CNPWModel;
import models.UPModel;


public class CNPWController {
	
	String username = UPModel.userID;
	String password = "";
	@FXML 
	private Label error;	
	@FXML
	private Label newpasslbl;
	@FXML
	private Label confpasslbl;
	@FXML
	private PasswordField oldpass;
	@FXML
	private PasswordField newpass;
	@FXML
	private PasswordField confpass;
	private CNPWModel model = new CNPWModel();
	private SceneController scenecontroller = new SceneController();
	
	@FXML
	public void processOldPass(ActionEvent event)
	{
		password = oldpass.getText();
		if(model.getUserProfileInfo().get(username).contains(password))
		{
			newpass.setVisible(true);
			newpasslbl.setVisible(true);
			newpass.requestFocus();
		}
		else
		{
			try{scenecontroller.ErrorPopup4(event);}catch(Exception e) {e.printStackTrace();}
		}
	}
	@FXML
	public void processNewPass(ActionEvent event)
	{
		if(!password.contentEquals(newpass.getText()))
		{
			password = newpass.getText();
			confpass.setVisible(true);
			confpasslbl.setVisible(true);
			confpass.requestFocus();
		}
		else
		{
			try {scenecontroller.ErrorPopup5(event);}catch(Exception e) {e.printStackTrace();}
		}
		
	}
	@FXML
	public void processConfPass(ActionEvent event)
	{
		String temp = confpass.getText();
		if(password.contentEquals(temp))
		{
			model.replaceUserPW(username, password);
			try{scenecontroller.closeCurrent(event);}catch(Exception e) {e.printStackTrace();}
		}
		else
		{
			try {scenecontroller.ErrorPopup2(event);}catch(Exception e) {e.printStackTrace();}
		}
	}
	
}
