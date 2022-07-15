package models;


import java.io.IOException;
import java.util.Map;

import application.FileInteract;


public class CNPWModel {
	
	private Map<String,String> UserProfileInfo = SignInModel.UserProfileInfo;
	private FileInteract fileinteract = new FileInteract();
	
	public void getUserProfileInfo() throws IOException
	{
		fileinteract.processGUP(UserProfileInfo);
	}
	public void setUserProfileInfo() throws IOException
	{
		fileinteract.processSUP(UserProfileInfo);
	}
	public boolean processUser(String username, String password)
	{
		if(UserProfileInfo.containsKey(username) == true)
		{
			if(UserProfileInfo.get(username) == password)
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
	public void replaceUserPW(String username, String password)
	{
		UserProfileInfo.replace(username, password);
		try {
			setUserProfileInfo();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
}
