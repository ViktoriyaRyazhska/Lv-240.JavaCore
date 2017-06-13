
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileTask {

	public static void main(String[] args) {		
		String[] array = fileToStringArray("file1.txt");
		
		int stringCount = array.length;
		String longestLine = findLongestLineInArray(array);

		BufferedWriter writer = null;
		try {
			System.out.println("Writing to file2.txt is about to start...");
			writer = new BufferedWriter(new FileWriter("file2.txt"));
			writer.write("1. Lines count = " + stringCount + "\n");
			writer.write("2. Longest line = " + longestLine + "\n");
			writer.write("3. Alex Vinogradov 23/08/82 \n");
			System.out.println("Writing to file2.txt ended successfully...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	private static String[] fileToStringArray(String fileName) {
		Path path = new File(fileName).toPath();
		List<String> list = new ArrayList<>();
		try {
			list = Files.readAllLines(path);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String[] array = list.toArray(new String[]{});
		
		return array;
	}
	
	private static String findLongestLineInArray(String[] array){
		int index = 0;
		int elementMaxLength = array[0].length();
		for (int i = 1; i < array.length; i++){
			if (array[i].length() > elementMaxLength) {
				index = i;
				elementMaxLength = array[i].length();
			}
		}
		
		return array[index];
	}
}

	
