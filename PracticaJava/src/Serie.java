
import java.time.LocalTime;

public class Serie extends Pelicula {


	private int no_temporada;

	
	
	public Serie() {
		
		this.no_temporada =1;
	
	}
	
	
	public Serie(int no_temporada, String genero, LocalTime duracion) {
		super("Creado por defecto",genero, "Michael Javier", no_temporada, duracion,false);
		this.no_temporada = no_temporada;
			
	
	}

	
	public int getNo_temporada() {
		return no_temporada;
	}
	public void setNo_temporada(int no_temporada) {
		
		this.no_temporada = no_temporada;
	}


	@Override
	public String toString() {
		
		String resul ="Serie \n "
				+ "titulo=" + getTitulo() 
				+ ", genero=" + getGenero() 
				+ ", creador=" + getCreador()
				+ ", año=" + getAño()
				+ ", duracion=" + getDuracion()
				+ ", visto=" + esVisto()
				+"  no_temporada=" + getNo_temporada()
		+ ", tiempoVisto()=" + tiempoVisto();
		return resul;
		
		
	}



	
	
}
