import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Ejecutable {

	private static String rrts[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			ArrayList<Pelicula> peliArra = new ArrayList<Pelicula>();
			ArrayList<Serie> serieArra = new ArrayList<Serie>();
			

			
  peliArra.add(new Pelicula());
peliArra.get(0).setTitulo("Pelicula1");
peliArra.get(0).setGenero("Genero1");
peliArra.get(0).setCreador("Creador1");
peliArra.get(0).setAño(2001);	  
  LocalTime tim = LocalTime.of(1, 40, 0);
peliArra.get(0).setDuracion(tim);
  LocalTime tiempoVisto = LocalTime.of(1, 40, 0);
peliArra.get(0).setTiempoVisto(tiempoVisto);
peliArra.get(0).marcarVisto();
 
peliArra.add( new Pelicula("Pelicula2", "Genero2"));	  
peliArra.add( new Pelicula("Pelicula3","Genero3","Creador3",2003,LocalTime.of(1, 40, 0),LocalTime.of(0, 10, 2))); 
peliArra.add( new Pelicula("Pelicula4","Genero4","Creador4",2004,LocalTime.of(1, 10, 0),LocalTime.of(0, 5, 2)));
peliArra.add( new Pelicula("Pelicula5","Genero5","Creador5",2005,LocalTime.of(1, 40, 0),LocalTime.of(1, 40, 0)));
  peliArra.get(4).marcarVisto();
  
  serieArra.add(new Serie());
  serieArra.get(0).setTitulo("Serie1");
  serieArra.get(0).setGenero("Genero1");
  serieArra.get(0).setCreador("Creador1");
  serieArra.get(0).setAño(1991);	  
  LocalTime timeseri = LocalTime.of(0, 40, 0);
  serieArra.get(0).setDuracion(timeseri);
  LocalTime SerieTiempoVisto = LocalTime.of(0, 40, 0);
  serieArra.get(0).setTiempoVisto(SerieTiempoVisto);
  serieArra.get(0).marcarVisto();
  
  
  serieArra.add( new Serie("Serie2", "Genero2"));	  
  serieArra.add(new Serie("Serie3","Genero3","Creador3",3,1992,LocalTime.of(0, 40, 0),LocalTime.of(0, 6, 0)));	 
  serieArra.add( new Serie("Serie4","Genero4","Creador4",4,1993,LocalTime.of(0, 40, 0),LocalTime.of(0, 14, 0)));
  serieArra.add( new Serie("Serie5","Genero5","Creador5",5,1994,LocalTime.of(0, 40, 0),LocalTime.of(0, 40, 0)));
  serieArra.get(4).marcarVisto();
  
  
  /*General*/
  System.out.println("\n *****************************IMPRESION DE PELICULAS Y SERIES EN GENERAL");
  for (Serie serie : serieArra) {
			  if(serie != null)
			System.out.println(serie.getTitulo()+":"+((serie.toString().replace('[', ' ').replace(']', ' '))));

}
 
  for (Pelicula peli : peliArra) {
			  if(peli != null)
//	
			  System.out.println(peli.getTitulo()+":"+((peli.toString().replace('[', ' ').replace(']', ' '))));

}
  
  /*Peliculas y Series que se visualizaron completamente*/
  System.out.println("\n *****************************PELICULAS Y SERIES QUE SE VIZUALIZARON COMPLETAMENTE");
  for (Serie serie : serieArra) {
			  if(serie.visto == true) {
//	
			System.out.println(serie.getTitulo()+":"+((serie.toString().replace('[', ' ').replace(']', ' '))));
			
			  }

}
 
				  for (Pelicula peli : peliArra) {
							  if(peli.visto == true) {
							//
							  System.out.println(peli.getTitulo()+":"+((peli.toString().replace('[', ' ').replace(']', ' '))));
				
							  	} 
				  }
			  
			  /*Serie con mas temporadas y pelicula del anio mas reciente*/
			  System.out.println("\n *****************************SERIE CON MAS TEMPORADAS Y PELICULA DEL ANIO MAS RECIENTE");
			  Collections.sort(serieArra, new Serie());
			  
			
			  System.out.println("Serie con mas temporada: "+serieArra.get(0));
				  
			   Collections.sort(peliArra, new Pelicula());
				  System.out.println("Pelicula del anio mas reciente: "+peliArra.get(0));
				  
				  
				 
				  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
	 
	}

}

