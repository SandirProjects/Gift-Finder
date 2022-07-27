package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.CNUNModel;
import models.UPModel;

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
	private CNUNModel model = new CNUNModel();
	private SceneController scenecontroller = new SceneController();
	
	
	@FXML
	public void processPW(ActionEvent event) throws IOException
	{
		password = oldpass.getText();
		if(model.getUserProfileInfo().get(UPModel.userID).contentEquals(password))
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
	

}
