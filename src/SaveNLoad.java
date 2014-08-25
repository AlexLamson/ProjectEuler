import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class SaveNLoad
{
	public static void arrayToFile(String[] arr, String filePath)
	{
		BufferedWriter writer = null;
		try
		{
			writer = new BufferedWriter(new FileWriter(filePath));
			
			for(int i = 0; i < arr.length; i++)
			{
				writer.write(arr[i]);
				writer.newLine();
			}
			
			writer.flush();
			writer.close();

		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static String[] fileToArray(String filePath)
	{
		try
		{
			List<String> lines;
			lines = Files.readAllLines(Paths.get(URI.create("file:///"+filePath.replaceAll(" ", "%20"))), Charset.forName("UTF-8"));
			String[] arr = lines.toArray(new String[lines.size()]);
			
			return arr;
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return new String[]{};
	}
}
