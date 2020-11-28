package Ejerc9;

import java.io.File;
import java.io.IOException;

public class List {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		  // create a new list of arguments for our process
	      String[] list = {"dir C:\\\\Users\\\\Manu\\\\git\\\\procesos\\\\ProcesosProSe\\\\src"};

	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);
	      
	      
	      pb.redirectOutput(new File("salida_ejercicio9.txt"));
	      pb.redirectError(new File("log_ejercicio9.txt"));
	      
	      pb.start();
	}

}
