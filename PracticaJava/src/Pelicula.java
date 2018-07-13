import java.sql.Time;

import java.time.LocalTime;

public  class Pelicula implements Visualizable{

	private String titulo;
	protected String genero;
	private String creador;
	private int año;
	private LocalTime duracion;
	private boolean visto;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String titulo, String genero, String creador, int año, LocalTime duracion,boolean visto) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
		this.visto =visto;
	}
	
	public Pelicula(String titulo, String genero, String creador, int año, LocalTime duracion) {
	
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
	}


	public Pelicula(String titulo, String creador) {

		this.titulo = titulo;
		this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		String resul ="Pelicula \n"
				+ "titulo=" + titulo 
				+ ", genero=" + genero 
				+ ", creador=" + creador
				+ ", año=" + año
				+ ", duracion=" + duracion
				+ ", visto=" + visto;
		return resul;
	}

	@Override
	public void marcarVisto(boolean visto) {
		// TODO Auto-generated method stub
		this.visto=visto;
		
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}

	@Override
	public LocalTime tiempoVisto() {
		// TODO Auto-generated method stub
		return getDuracion();
	}
	

}
