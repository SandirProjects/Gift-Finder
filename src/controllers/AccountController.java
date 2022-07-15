package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import models.UPModel;

public class AccountController {
	
	@FXML
	private Label acctusername;
	@FXML
	private Button cusername;
	@FXML
	private Button cpassword;
	@FXML
	private Button exit;
	
	@FXML
	public void initialize()
	{
		String userID = UPModel.userID;
		acctusername.setText(userID);
		acctusername.setTextFill(Color.RED);
	}
	
	@FXML
	public void changeUsername(ActionEvent event)
	{
		
	}
	@FXML
	public void changePassword(ActionEvent event)
	{
		
	}
	@FXML
	public void exit()
	{
		
	}

}
