package application;

import java.util.ArrayList;
import java.util.Random;
/**
 * This class handles gift suggestions for the user.
 * @author sandi
 *
 */
public class RandomizedSelection {
	
	
	public String randomizedSuggestions(ArrayList<String> items)
	{
		Random rand = new Random();
		String suggestions = "";
		
		for (int i = 0; i < 5; i++)
		{
			suggestions += "  *" + items.get(rand.nextInt(items.size())) + "\n";
		}
		
		return suggestions;
	}
}
