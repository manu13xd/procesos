package ProcessBuilderFirefox;

import java.io.IOException;

public class Firefox {
	
	

	private static final String LINK = "https://iescristobaldemonroy.net/moodle/";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
        var processBuilder = new ProcessBuilder();

        processBuilder.command("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\"",LINK);

        var process = processBuilder.start();

	}

}
