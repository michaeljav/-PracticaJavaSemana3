

import java.time.LocalTime;
import java.util.Comparator;

public  class Pelicula extends Video implements IVisualizable,Comparator<Pelicula>{


	
	public Pelicula() {
		super();
	}	

	public Pelicula(String titulo, String creador) {

		super(titulo,creador);
		super.visto=false;
	
	}
	
	public Pelicula(String titulo, String genero, String creador, int año, LocalTime duracion,LocalTime tiempoVisto) {
		super( titulo,  genero,  creador,  año,  duracion,tiempoVisto);
		
	}
	

	
	@Override
	public String toString() {
		

		
		String resul =""
				+ "  titulo=" + getTitulo() 
				+ ", genero=" + getGenero() 
				+ ", creador=" + getCreador()
				+ ", año=" + getAnio()
				+ ", duracion=" + getDuracion()
				+ ", tiempoVisto=" + getTiempoVisto()
				+ ", visto=" + esVisto() +"";
		return resul;
		
		
	}
	

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		super.visto=true;
		
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}

	@Override
	public LocalTime tiempoVisto() {
		// TODO Auto-generated method stub
		return getTiempoVisto();
	}


	


	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		// TODO Auto-generated method stub
		 return  o2.getAnio()-o1.getAnio() ;
	}
	
	

}
