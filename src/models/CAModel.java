package models;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import application.FileInteract;

public class CAModel {
	
	
	private FileInteract fileinteract = new FileInteract();
	private HashMap<String, UPModel/*String*/> UserProfileInfo = SignInModel.UserProfileInfo;
	
	public Map<String, UPModel/*String*/> getMap()
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
	
	public boolean findUser(String username)
	{
		if(UserProfileInfo.containsKey(username) != true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void addUser(String username, String password)
	{
		SignInModel.curUsername = username;
		UPModel user = new UPModel(username, password);
		UserProfileInfo.put(username, user/*password*/);
		try{setUserProfileInfo();}catch(Exception e){e.printStackTrace();}
	}

}
