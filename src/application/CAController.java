package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
				boolean uservalidate = model.processUser(userID, passID);
				if(uservalidate == true)
				{
					try {scenecontrol.ErrorPopup3(event);}catch(Exception e){e.printStackTrace();}
				}
				else if(uservalidate == false)
				{
					allowConfirmPW();
				}
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
				
				try{scenecontrol.startSignInPage(event);}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				try {scenecontrol.ErrorPopup2(event);}catch(Exception e){e.printStackTrace();}
			}
		}
	}
}

