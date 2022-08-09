package models;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import application.FileInteract;

public class CNUNModel {
	private HashMap<String, UPModel> UserProfileInfo = SignInModel.UserProfileInfo;
	private FileInteract fileinteract = new FileInteract();
	
	public Map<String, UPModel> getUserProfileInfo()
	{
		return UserProfileInfo;
	}
	public void setUserProfileInfo() throws IOException
	{
		fileinteract.processSUP(UserProfileInfo);
	}
	public boolean processUser(String username, String password)
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
	
	public void replaceUsername(String username, String password)
	{
		UPModel user = new UPModel(username, password);
		UPModel oldUser = UserProfileInfo.get(SignInModel.curUsername);
		user.friends = oldUser.friends;
		user.interests = oldUser.interests;
		
		UserProfileInfo.remove(SignInModel.curUsername);
		SignInModel.curUsername = username;
		UserProfileInfo.put(username, user);
		
		try {setUserProfileInfo();}catch(Exception e){e.printStackTrace();}	
		
	}
	
}
