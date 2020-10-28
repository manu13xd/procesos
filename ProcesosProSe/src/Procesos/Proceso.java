package Procesos;

public class Proceso {
	//VARIABLES
	private String nombre;
	private long duracion;
	
	Proceso (String nombre, long duracion){
		this.nombre=nombre;
		this.duracion=duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
