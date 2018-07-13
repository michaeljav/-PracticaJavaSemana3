import java.time.LocalTime;

public interface Visualizable {

	 public void marcarVisto(boolean visto);
	 
	 public boolean esVisto();
	 
	 public  LocalTime tiempoVisto();
}
