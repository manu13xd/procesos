package Procesos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		//VARIABLES
		Planificador FCFS = null;
		ArrayList<Proceso> colaProcesos = new ArrayList<Proceso>();
		String nombre;
		long duracion;
			
		for(int i=0;i<5;i++) {
			nombre="P_"+i;
			duracion=(long) (Math.random()*4+1)*1000;
			colaProcesos.add(new Proceso(nombre,duracion));
		}
		
		FCFS = new Planificador(colaProcesos);
		FCFS.sirve();
	}

}
