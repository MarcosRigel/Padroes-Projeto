package one.digitalinnovation.gof;

/*
 * Singleton "preguiçoso".
 * 
 * @author falvojr
 * 
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super(); // chama o construtor da classe pai
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
