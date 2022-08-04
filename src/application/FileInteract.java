package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class FileInteract 
{
	private String filepath;
	private File folder = new File("UserProfileData");
	private File file;
	
	
	public String getFilePath()
	{
		return filepath;
	}
	public void printFile(String filepath) throws IOException
	{
		File file = new File(filepath);
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) 
		{
			String token = scan.next();
			System.out.println(token);
		}
		scan.close();
		
	}
	public void processGUP(Map<String,String> UserProfileInfo) throws IOException
	{
		File file = new File(filepath);
		Scanner scan = new Scanner(file);
		while(scan.hasNext())
		{
			String token = scan.next();
			char [] chararray = new char [token.length()];
			chararray = token.toCharArray();
			String username = "";
			String password = "";
			boolean pwtime = false;
			boolean untime = false;
	
			for(char ch: chararray)
			{
				if(ch == '{')
				{
					untime = true;
					continue;
				}
				else if(untime == true && pwtime == false)
				{
					username+=ch;
				}
				else if(ch == '=')
				{
					untime = false;
					pwtime = true;
					continue;
				}
				else if(untime == false && pwtime == true)
				{
					password += ch;
				}
				else if(ch == ',')
				{
					pwtime = false;
					untime = true;
				}
				else if(ch == '}')
				{
					pwtime = false;
					untime = false;
				}
				else
				{
					System.out.println("ERROR");
				}
			}
			UserProfileInfo.put(username, password);
		}
		scan.close();
	}
	public void processSUP(Map<String,String> UserProfileInfo) throws IOException
	{
		folder.mkdir();
		file = new File(folder, "UserProfileData.txt");
		/*File folder = new File("UserProfileData");
		folder.mkdir();
		File file = new File(folder, "UserProfileData.txt");*/
		try
		{
			file.createNewFile();
			FileWriter printer = new FileWriter(file, false);
			printer.write('{');
			for(Map.Entry<String,String> entry : UserProfileInfo.entrySet())
			{
				printer.write(entry.getKey());
				printer.write('=');
				printer.write(entry.getValue());
				printer.write(", ");
			}
			printer.write('}');
			printer.close();
		}catch(Exception e){e.printStackTrace();}
		filepath = file.getAbsolutePath();
	}
	
}