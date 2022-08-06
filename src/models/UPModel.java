package models;

import java.util.ArrayList;
import java.util.HashMap;

public class UPModel {

	public String userID;
	public ArrayList<String> friends = new ArrayList<String>();
	public HashMap<String, ArrayList<String>> interests = new HashMap<String, ArrayList<String>>();
	//public static HashMap<String, FriendModel> hash = new HashMap<String, FriendModel>();
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
			friendsList += "*" + s + "\n";
		}
		return friendsList;
	}
	
	public String interestsToString()
	{	
		String finalInt = "";
		if (interests.get("Electronics") != null)
		{
			finalInt += "Electronics :\n";
			for (String s: interests.get("Electronics"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}

		if (interests.get("Jewelry") != null)
		{
			finalInt += "Jewelry :\n";
			for (String s: interests.get("Jewelry"))
			{
				finalInt += "\t*" + s + "\n";
			}
		
		}
		
		if (interests.get("Kitchen") != null)
		{
			finalInt += "Kitchen :\n";
			for (String s: interests.get("Kitchen"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("LawnGarden") != null)
		{
			finalInt += "LawnGarden :\n";
			for (String s: interests.get("LawnGarden"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Men") != null)
		{
			finalInt += "Men :\n";
			for (String s: interests.get("Men"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Pet") != null)
		{
			finalInt += "Pet :\n";
			for (String s: interests.get("Pet"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Snacks") != null)
		{
			finalInt += "Snacks :\n";
			for (String s: interests.get("Snacks"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Sports") != null)
		{
			finalInt += "Sports :\n";
			for (String s: interests.get("Sports"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Tools") != null)
		{
			finalInt += "Tools :\n";
			for (String s: interests.get("Tools"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Toys") != null)
		{
			finalInt += "Toys :\n";
			for (String s: interests.get("Toys"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("VideoGames") != null)
		{
			finalInt += "VideoGames :\n";
			for (String s: interests.get("VideoGames"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		if (interests.get("Women") != null)
		{
			finalInt += "Women :\n";
			for (String s: interests.get("Women"))
			{
				finalInt += "\t*" + s + "\n";
			}
		}
		
		
		
		
		return finalInt;
	}
}
