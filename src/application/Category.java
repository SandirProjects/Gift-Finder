package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import models.SignInModel;
/**
 * This class handles processing user interests.
 * @author sandi
 *
 */
public class Category {
	
	public HashMap<String, ArrayList<String>> Categories = SignInModel.Categories;
	
	public void categoryReader(String name, String fileName) throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		ArrayList<String> items = new ArrayList<String>();
		while (scan.hasNext())
		{
			items.add(scan.nextLine());
		}
		Categories.put(name, items);
		scan.close();
	}
}
