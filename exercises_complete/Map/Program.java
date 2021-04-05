package exercises_complete.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		String path = "c:\\temp\\Gabriel.txt";
		Map<String, Integer> map = new TreeMap<>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			
			while(line != null) {
				String []x = line.split(",");
				if(!map.containsKey(x[0])) {
					map.put(x[0], Integer.parseInt(x[1]));
				}else {
					map.put(x[0], (map.get(x[0]) + Integer.parseInt(x[1])));
				}
				line = bf.readLine();
			}
		}catch(IOException e) {e.getStackTrace();}
		
		for (String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
	}
}