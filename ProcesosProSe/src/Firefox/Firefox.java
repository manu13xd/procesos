package Firefox;

import java.io.IOException;

public class Firefox {

	public static void main(String[] args) throws IOException {
		
		Runtime rt = null;
		
		rt =  Runtime.getRuntime();
		
		
		rt.exec("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\"");

	}

}
