package hilos;

public class Proceso1 implements Runnable {
	@Override
	public void run() {
		for(int x=0;x<10;x++) {
		String NumHilo = Thread.currentThread().getName();
		System.out.println(NumHilo);
	}
	}
}
