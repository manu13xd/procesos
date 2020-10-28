package Procesos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Planificador {
	// VARIABLES
	Queue<Proceso> colaRandom = new LinkedList<Proceso>();
	
	Planificador(ArrayList<Proceso> procesos) {
		Collections.shuffle(procesos);
		colaRandom.addAll(procesos);
	}

	public Proceso get() throws InterruptedException {
		// VARIABLES
		long inicioMilis, finMilis, totalMilis;
		Proceso procesoActual = colaRandom.poll();

		if(procesoActual!=null) {
			System.out.println(
					"********************** INICIO PROCESO " + procesoActual.getNombre() + " **********************");
			inicioMilis = System.currentTimeMillis();
			System.out.println("Hora inicio: " + inicioMilis);
			Thread.sleep(procesoActual.getDuracion());
			finMilis = System.currentTimeMillis();
			System.out.println("Hora fin: " + finMilis);
			totalMilis = finMilis - inicioMilis;
			System.out.println(
					"--> Duracion del hilo (" + procesoActual.getDuracion() + ") " + procesoActual.getNombre() + " || " + totalMilis);
			System.out.println(
					"********************** FIN PROCESO " + procesoActual.getNombre() + " *************************");	
		}
		
		return procesoActual;
	}

	public boolean put(Proceso nuevoProceso) {
		return colaRandom.add(nuevoProceso);
	}
	
	public void sirve() throws InterruptedException {
		while(get()!=null);
	}

}
