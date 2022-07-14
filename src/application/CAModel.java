package application;


import java.io.IOException;
import java.util.Map;

public class CAModel {
	
	
	private FileInteract fileinteract = new FileInteract();
	private Map<String,String> UserProfileInfo = SignInModel.UserProfileInfo;
	
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
	public boolean processUser(String username, String password)
	{
		if(UserProfileInfo.containsKey(username) == false)
		{
			return false;
		}
		else
		{
			return true;
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
	public void addUser(String username, String password)
	{
		UserProfileInfo.put(username, password);
		try{setUserProfileInfo();}catch(Exception e){e.printStackTrace();}
	}

}
