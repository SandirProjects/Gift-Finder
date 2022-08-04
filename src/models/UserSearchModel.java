package models;

import java.util.Map;

public class UserSearchModel {
	
	private Map<String,String> UserProfileInfo = SignInModel.UserProfileInfo;
	
	public String findUsers(String username)
	{
		 if (UserProfileInfo.get(username) == null)
			 return "";
		 else
			 return UserProfileInfo.get(username);
	}
	
	public String toString()
	{
		String allUsers = "";
		StringBuilder str;
		
		allUsers += UserProfileInfo.keySet();
		str = new StringBuilder(allUsers);
		str.setCharAt(0, '*');
		
		for (int i = 0; i < allUsers.length(); i++)
		{
			if (str.charAt(i) == ',')
				str.setCharAt(i, '\n');
			
			else if(str.charAt(i) == ' ')
				str.setCharAt(i, '*');
			
		}
		str.setCharAt(allUsers.length()-1, ' ');
		allUsers = str.toString();
		return allUsers;
	}
}
