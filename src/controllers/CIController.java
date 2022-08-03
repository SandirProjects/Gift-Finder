package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CIController {
	
	//FIXME: Process interests checked off
	
	@FXML
	private Button submit;
	
	private SceneController scenecontroller = new SceneController();
	
	
	//FIXME: Only closes current scene
	@FXML
	public void processSubmit(ActionEvent event)
	{
		try{scenecontroller.closeCurrent(event);}catch(Exception e){e.printStackTrace();}
	}
	
	
}
