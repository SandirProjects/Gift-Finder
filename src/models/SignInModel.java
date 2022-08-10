package models;
/**
 * This class handles the data from the Sign In view.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import application.FileInteract;

public class SignInModel {
	
	public static HashMap<String, UPModel> UserProfileInfo = new HashMap<String, UPModel>();
	public static HashMap<String, ArrayList<String>> Categories = new HashMap<String, ArrayList<String>>(); 
	public static String curUsername = "";
	private FileInteract fileinteract = new FileInteract();
	
	public Map<String, UPModel> getMap()
	{
		return UserProfileInfo;
	}
	public void getUserProfileInfo() throws IOException
	{
		fileinteract.processGUP(UserProfileInfo);
	}
	public void setUserProfileInfo() throws IOException
	{
		fileinteract.processSUP(UserProfileInfo);
	}
	public static boolean processUser(String username, String password)
	{
		if(UserProfileInfo.containsKey(username) == true)
		{
			if (UserProfileInfo.get(username).userPass.equals(password))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public static boolean findUser(String username)
	{
		if(UserProfileInfo.containsKey(username) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}