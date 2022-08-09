package controllers;

import java.util.HashMap;
import application.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import models.SignInModel;
import models.UPModel;

public class CIController {
	
	
	@FXML
	private Button submit;
	@FXML
	private CheckBox women;
	@FXML
	private CheckBox electronics;
	@FXML
	private CheckBox jewelry;
	@FXML
	private CheckBox kitchen;
	@FXML
	private CheckBox lawnGarden;
	@FXML
	private CheckBox men;
	@FXML
	private CheckBox pet;
	@FXML
	private CheckBox snacks;
	@FXML
	private CheckBox sports;
	@FXML
	private CheckBox tools;
	@FXML
	private CheckBox toys;
	@FXML
	private CheckBox videoGames;
	private Category categories = new Category();
	private SceneController scenecontroller = new SceneController();
	private HashMap<String, UPModel/*String*/> UserProfileInfo = SignInModel.UserProfileInfo;
	private UPModel model = UserProfileInfo.get(SignInModel.curUsername);
	
	
	@FXML
	public void processSubmit(ActionEvent event)
	{
		try{scenecontroller.closeCurrent(event);}catch(Exception e){e.printStackTrace();}
	}
	
	@FXML
	public void processWomen(ActionEvent event)
	{
		categories.Categories.get("Women");
		model.interests.put("Women", categories.Categories.get("Women"));
	}
	
	@FXML
	public void processElectronics(ActionEvent event)
	{
		categories.Categories.get("Electronics");
		model.interests.put("Electronics", categories.Categories.get("Electronics"));
	}
	
	@FXML
	public void processKitchen(ActionEvent event)
	{
		categories.Categories.get("Kitchen");
		model.interests.put("Kitchen", categories.Categories.get("Kitchen"));
	}
	
	@FXML
	public void processLawnGarden(ActionEvent event)
	{
		categories.Categories.get("LawnGarden");
		model.interests.put("LawnGarden", categories.Categories.get("LawnGarden"));
	}
	
	@FXML
	public void processMen(ActionEvent event)
	{
		categories.Categories.get("Men");
		model.interests.put("Men", categories.Categories.get("Men"));
	}
	
	@FXML
	public void processPet(ActionEvent event)
	{
		categories.Categories.get("Pet");
		model.interests.put("Pet", categories.Categories.get("Pet"));
	}
	
	@FXML
	public void processSnacks(ActionEvent event)
	{
		categories.Categories.get("Snacks");
		model.interests.put("Snacks", categories.Categories.get("Snacks"));
	}
	
	@FXML
	public void processSports(ActionEvent event)
	{
		categories.Categories.get("Sports");
		model.interests.put("Sports", categories.Categories.get("Sports"));
	}
	
	@FXML
	public void processTools(ActionEvent event)
	{
		categories.Categories.get("Tools");
		model.interests.put("Tools", categories.Categories.get("Tools"));
	}
	
	@FXML
	public void processToys(ActionEvent event)
	{
		categories.Categories.get("Toys");
		model.interests.put("Toys", categories.Categories.get("Toys"));
	}
	
	@FXML
	public void processVideoGames(ActionEvent event)
	{
		categories.Categories.get("VideoGames");
		model.interests.put("VideoGames", categories.Categories.get("VideoGames"));
	}
	
	@FXML
	public void processJewelry(ActionEvent event)
	{
		categories.Categories.get("Jewelry");
		model.interests.put("Jewelry", categories.Categories.get("Jewelry"));
	}
	
	
	
	
}
