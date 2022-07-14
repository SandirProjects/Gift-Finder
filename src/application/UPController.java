package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UPController {
	
	@FXML
	private MenuItem account;
	@FXML
	private MenuItem signout;
	@FXML
	private Label USERNAME;

	
	private SceneController scenecontroller = new SceneController();
	
	@FXML
	public void initialize()
	{
		String userID = UPModel.userID;
		USERNAME.setFont(new Font("system", 25));
		USERNAME.setText(userID + "'s Gift Preferences");
	}
	@FXML
	public void processSignOut(ActionEvent event)
	{
		Stage stage = (Stage)signout.getParentPopup().getOwnerWindow();
		stage.close();
		try{scenecontroller.newSignInPage();}catch(Exception e){e.printStackTrace();}
	}
	

}
