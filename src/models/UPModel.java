package models;
/**
 * This class handles the data from the user profile view.
 */
import java.util.ArrayList;
import java.util.HashMap;

import application.RandomizedSelection;

public class UPModel {

	public String userID;
	public ArrayList<String> friends = new ArrayList<String>();
	public HashMap<String, ArrayList<String>> interests = new HashMap<String, ArrayList<String>>();
	public RandomizedSelection suggestions= new RandomizedSelection();
	public String userPass;
	
	public UPModel(String username, String pass)
	{
		this.userID = username;
		this.userPass = pass;
	}
	public String getuserID()
	{
		return userID;
	}
	
	public String friendsToString()
	{
		String friendsList = "";
		for (String s: this.friends)
		{
			friendsList += "*" + s + "\n\n";
		}
		return friendsList;
	}
	
	public String interestsToString(boolean show)
	{	
		String finalInterests = "";
		if (interests.get("Electronics") != null)
		{
			finalInterests += "Electronics\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Electronics")) + "\n";
		}

		if (interests.get("Jewelry") != null)
		{
			finalInterests += "Jewelry\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Jewelry")) + "\n";
		
		}
		
		if (interests.get("Kitchen") != null)
		{
			finalInterests += "Kitchen\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Kitchen")) + "\n";
			
		}
		
		if (interests.get("LawnGarden") != null)
		{
			finalInterests += "Lawn and Garden\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("LawnGarden")) + "\n";
		}
		
		if (interests.get("Men") != null)
		{
			finalInterests += "Men's Apparel\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Men")) + "\n";
			
		}
		
		if (interests.get("Pet") != null)
		{
			finalInterests += "Pets\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Pet")) + "\n";
		}
		
		if (interests.get("Snacks") != null)
		{
			finalInterests += "Snacks\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Snacks")) + "\n";
		}
		
		if (interests.get("Sports") != null)
		{
			finalInterests += "Sports\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Sports")) + "\n";
		}
		
		if (interests.get("Tools") != null)
		{
			finalInterests += "Tools\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Tools")) + "\n";
		}
		
		if (interests.get("Toys") != null)
		{
			finalInterests += "Toys\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Toys")) + "\n";
		}
		
		if (interests.get("VideoGames") != null)
		{
			finalInterests += "Video Games\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("VideoGames")) + "\n";
		}
		
		if (interests.get("Women") != null)
		{
			finalInterests += "Women's Apparel\n\n";
			if (show)
				finalInterests += suggestions.randomizedSuggestions(interests.get("Women")) + "\n";
		}
		
		
		
		
		return finalInterests;
	}
}
