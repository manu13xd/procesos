package GuardarDirectorio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		   String[] pathnames;
		   

	        // Creates a new File instance by converting the given pathname string
	        // into an abstract pathname
	        File f = new File("C:\\Users\\Carlos\\Desktop\\ACCDAficheros");
	        pathnames = f.list();
	        
	        try (BufferedWriter ola=new BufferedWriter(new FileWriter("Directorio.txt"))) {
	        	
	        	 for (String pathname : pathnames) {
	 	            //Print the names of files and directories   
	 	            ola.write(pathname);
	 	            ola.newLine();
	 	        }
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	        
	}

}
