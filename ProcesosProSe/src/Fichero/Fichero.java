package Fichero;

import java.io.File;

public class Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String[] pathnames;

	        // Creates a new File instance by converting the given pathname string
	        // into an abstract pathname
	        File f = new File("C:\\Users\\Carlos\\Desktop\\ACCDAficheros");

	        // Populates the array with names of files and directories
	        pathnames = f.list();

	        // For each pathname in the pathnames array
	        for (String pathname : pathnames) {
	            // Print the names of files and directories
	            System.out.println(pathname);
	        }

	}
}