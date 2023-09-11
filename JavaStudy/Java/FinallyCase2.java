package Java;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

class FinallyCase2 {
	public static void main(String[] args) {
		Path file = Paths.get("C://javastudy//Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				(writer ! = null)
				writer.close();		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}