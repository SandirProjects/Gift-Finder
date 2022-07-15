package models;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import application.FileInteract;

public class SignInModel {
	
	public static Map<String,String> UserProfileInfo = new HashMap<String,String>();
	private FileInteract fileinteract = new FileInteract();
	
	public Map<String,String> getMap()
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
			if(UserProfileInfo.get(username).contains(password))
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