package modelo;

public class SingletonIncremental {
	
	private static int count = 0;
	private int numero;
	private static SingletonIncremental instance;
	
	private SingletonIncremental(){
		numero = ++count;
		}
	
	public String toString() {
		return "Incremental " + numero;
		}
	
	synchronized public static SingletonIncremental getInstance(){
		if (instance == null)
			instance = new SingletonIncremental();
		
		return instance;
	}
/*ao utilizar o synchronized no metodo getInstance(), o acesso simultaneo de vários threads e impedido.
 * Por outro lado, isso gera um lentidao na performance do metodo*/

}
