package controllers;

import java.io.IOException;

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
	private SceneController scenecontroller = new SceneController();
	@FXML
	public void initialize()
	{
		String userID = UPModel.userID;
		acctusername.setText(userID);
		acctusername.setTextFill(Color.RED);
	}
	
	@FXML
	public void changeUsername(ActionEvent event) throws IOException
	{
		
	}
	@FXML
	public void changePassword(ActionEvent event) throws IOException
	{
		scenecontroller.startCNPW(event);
	}
	@FXML
	public void exit()
	{
		
	}

}
