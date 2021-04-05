package exercises_complete.ReaderFileReturnSize;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Set<User> set = new HashSet<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			
			while (line != null) {
				String[] f = line.split(" ");
				Date date = Date.from(Instant.parse(f[1]));
				set.add(new User(f[0], date));
				line = bf.readLine(); 
			}
		}catch(IOException pe) {pe.getStackTrace();}
		
				
		System.out.println("Total users: " + set.size());
		
		
		sc.close();
		
	}

}
