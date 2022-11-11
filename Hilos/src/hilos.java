public class hilos extends Thread  {


	private final String nombre;
	private final int retardo;
	
	
	// Constructor para inicializar el nombre del hilo y tiempo de retardo
	public hilos( String s,int d ) {
		nombre = s;
		retardo = d;
	}

	// El metodo run() ejecuta
	// threads. Cuando run() termina el thread muere

        @Override
	public void run() {

		// Con el método sleep retrasamos la ejecución el tiempo especificado
		try {
			sleep( retardo );
		} catch( InterruptedException e ) {
		}

		// Imprimimos el nombre y tiempo que hemos retardado el hilo
		
		System.out.println( "Prueba Hilos: "+nombre+" "+retardo);
	}
}
