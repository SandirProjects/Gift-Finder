package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.CNUNModel;
import models.SignInModel;

public class CNUNController {
	
	@FXML
	private PasswordField oldpass;
	@FXML
	private TextField newusername;
	@FXML
	private TextField confusername;
	@FXML
	private Label newusernamelbl;
	@FXML
	private Label confusernamelbl;
	
	private String password;
	private String username;
	private String confun;
	private CNUNModel model = new CNUNModel();
	private SceneController scenecontroller = new SceneController();
	
	@FXML
	public void processPW(ActionEvent event) throws IOException
	{
		password = oldpass.getText();

		if(model.getUserProfileInfo().get(SignInModel.curUsername).userPass.equals(password))
		{
			newusernamelbl.setVisible(true);
			newusername.setVisible(true);
			newusername.requestFocus();
		}
		else
		{
			scenecontroller.ErrorPopup4(event);
		}
	}
	@FXML
	public void processNewUN(ActionEvent event) throws IOException
	{
		username = newusername.getText();
		boolean usercheck = model.findUser(username);
		if(SignInModel.curUsername.contentEquals(username))
		{
			scenecontroller.ErrorPopup3(event);
		}
		else if (usercheck == true)
		{
			try {scenecontroller.ErrorPopup3(event);}catch(Exception e){e.printStackTrace();}
		}
		else
		{
			confusernamelbl.setVisible(true);
			confusername.setVisible(true);
			confusername.requestFocus();
		}
	}
	@FXML
	public void processConfUN(ActionEvent event) throws IOException
	{
		
		confun = confusername.getText();
		if(confun.contentEquals(username))
		{
			model.replaceUsername(username, password);
			scenecontroller.closeCurrent(event);
		}
		else
		{
			scenecontroller.ErrorPopup6(event);
			confusername.setText("");
		}
	}
	
}
