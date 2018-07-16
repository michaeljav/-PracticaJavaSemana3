import java.time.LocalTime;

public class Video {

	private String titulo;
	private String genero;
	private String creador;
	private int anio;
	private LocalTime duracion;
	private LocalTime tiempoVisto;
	protected boolean visto;
	
	
	public Video() {
		
	}
	



	public Video(String titulo, String genero) {
	
		this.titulo = titulo;
		this.genero = genero;		
		this.visto = false;
	}




	public Video(String titulo, String genero, String creador, int anio, LocalTime duracion,LocalTime tiempoVisto) {
	
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.anio = anio;
		this.duracion = duracion;
		this.tiempoVisto = tiempoVisto;
	
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
	public int getAnio() {
		return anio;
	}
	public void setAño(int año) {
		this.anio = año;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}




	public LocalTime getTiempoVisto() {
		return tiempoVisto;
	}




	public void setTiempoVisto(LocalTime tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}


}
