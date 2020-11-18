package FicheroError;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroError {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		      
		      
		    } catch (Exception e) {
		    BufferedWriter ola=new BufferedWriter(new FileWriter("FicheroError.txt"));
		    ola.write(e.getMessage());
		    ola.newLine();
		    ola.close();
		    }

	}

	

}
