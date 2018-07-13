import java.time.LocalTime;
import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try {
			
					  ArrayList<Pelicula> peliArra = new ArrayList<Pelicula>();
					  ArrayList<Serie> serieArra = new ArrayList<Serie>();
								
								
					  peliArra.add(new Pelicula());
					  peliArra.get(0).setTitulo("Pelicula1");
					  peliArra.get(0).setGenero("Genero1");
					  peliArra.get(0).setCreador("Creador1");
					  peliArra.get(0).setAño(2000);	  
					  LocalTime tim = LocalTime.of(1, 30, 2);
					  peliArra.get(0).setDuracion(tim);
					  peliArra.get(0).marcarVisto(true);
					 
					  peliArra.add(new Pelicula("Titulo2", "Genero2"));
					  peliArra.get(1).setCreador("Creador2");
					  peliArra.get(1).setAño(2002);	  
					  LocalTime tim2 = LocalTime.of(0, 30, 2);
					  peliArra.get(1).setDuracion(tim2);
					  peliArra.get(1).marcarVisto(false);
					 
					  
					  serieArra.add( new Serie());
					  serieArra.get(0).setTitulo("Serie");
					  serieArra.get(0).setGenero("Genero1");
					  serieArra.get(0).setCreador("Creador1");
					  serieArra.get(0).setAño(2005);	  
					  LocalTime timeseri = LocalTime.of(0, 40, 2);
					  serieArra.get(0).setDuracion(timeseri);
					  serieArra.get(0).marcarVisto(true);
					  
					  
					  serieArra.add(new Serie());
					  serieArra.get(1).setTitulo("Serie2");
					  serieArra.get(1).setGenero("Genero2");
					  serieArra.get(1).setCreador("Creador2");
					  serieArra.get(1).setAño(2006);	  
					  LocalTime timeseri2 = LocalTime.of(0, 20, 2);
					  serieArra.get(1).setDuracion(timeseri2);
					  serieArra.get(1).marcarVisto(false);
					 
					  
					  for (Serie serie : serieArra) {
								 
								System.out.println("\n"+serie.toString());
					
					}
					 
					  for (Pelicula peli : peliArra) {
								
								System.out.println("\n"+peli.toString());
					
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
	  
	  
	 
	}

}
