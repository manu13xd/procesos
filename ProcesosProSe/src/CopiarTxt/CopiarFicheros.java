package CopiarTxt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class CopiarFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		mostrarFicheroDeTexto("pepe.txt");
		
		

	}
	
	public static void mostrarFicheroDeTexto(String nombreFichero) {
		String linea;
		try (FileReader flujoLectura=new FileReader(nombreFichero);
			 BufferedReader filtroLectura=new BufferedReader(flujoLectura);
			 FileWriter flujoEscritura=new FileWriter("Copia"+nombreFichero+".txt");
			 BufferedWriter filtroEscritura=new BufferedWriter(flujoEscritura);)
		{
			
			
			linea=filtroLectura.readLine();
			while ( linea!=null){
				filtroEscritura.write(linea);
				linea=filtroLectura.readLine();
				filtroEscritura.newLine();
						
			}
			
		
		}
		catch(FileNotFoundException e){
			System.out.println("No existe el fichero " + nombreFichero);
		}
		catch(IOException e){
			System.out.println( e.getMessage());
		}
		
	}

}
