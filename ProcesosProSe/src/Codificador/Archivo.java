package Codificador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Archivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodificarArchivoTexto("fichero_a_cifrar.txt");
		DescodificarArchivoTexto("Copiafichero_a_cifrar.txt.txt");
		
		

	}
	
	public static void CodificarArchivoTexto(String nombreFichero) {
		String linea;
		try (FileReader flujoLectura=new FileReader(nombreFichero);
			 BufferedReader filtroLectura=new BufferedReader(flujoLectura);
			 FileWriter flujoEscritura=new FileWriter("Copia"+nombreFichero+".txt");
			 BufferedWriter filtroEscritura=new BufferedWriter(flujoEscritura);)
		{
			
			
			linea=filtroLectura.readLine();
			while ( linea!=null){
				filtroEscritura.write(Codificacion.codifica(linea));
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
	
	public static void DescodificarArchivoTexto(String nombreFichero) {
		String linea;
		String lineaDescodificada;
		try (FileReader flujoLectura=new FileReader(nombreFichero);
			 BufferedReader filtroLectura=new BufferedReader(flujoLectura);)
		{
			
			
			linea=filtroLectura.readLine();
			while ( linea!=null){
				
				if (linea!=null) {
					lineaDescodificada=Codificacion.decodifica(linea);
					System.out.println(lineaDescodificada);
				}
				linea=filtroLectura.readLine();
				
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
