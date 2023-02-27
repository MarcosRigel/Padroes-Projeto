package one.digitalinnovation.gof.singleton;

/*
 * Singleton "apressado".
 * 
 * @author falvojr
 * 
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super(); // chama o construtor da classe pai
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}