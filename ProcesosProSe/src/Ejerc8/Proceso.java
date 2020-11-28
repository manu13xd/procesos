package Ejerc8;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Proceso {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  var processBuilder = new ProcessBuilder();

	        processBuilder.command("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\"");
	        Map<String,String> ola = processBuilder.environment();
	        Set<String> keys = ola.keySet();
	        var process = processBuilder.start();
	        
	        for (String key : keys) {
				System.out.println(key+" ==> "+ola.get(key));
			}

	     

	}

}
