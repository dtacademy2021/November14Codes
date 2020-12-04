package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromATextFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File f = new File("C:\\Users\\Duotech\\Desktop\\Duo\\furkan.txt");
		
		
		Scanner sc = new Scanner(f); // I opened a file(created a connection to the file) and ready to read
		
		
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		
		
		while(sc.hasNext()) {
			System.out.print(sc.next() + " ");
		}
		
		


		

	}

}
