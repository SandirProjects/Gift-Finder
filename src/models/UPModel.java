package models;

import java.util.ArrayList;
import java.util.HashMap;

public class UPModel {

	public static String userID;
	public static ArrayList<String> friends = new ArrayList<String>();
	public static HashMap<String, FriendModel> hash = new HashMap<String, FriendModel>();
	
	public String getuserID()
	{
		return userID;
	}
	
	public static String friendsToString()
	{
		String friendsList = "";
		for (String s: friends)
		{
			friendsList += "*" + s + "\n";
		}
		return friendsList;
	}
}
