package visao;

import modelo.SingletonIncremental;

public class SingletonPatternIncremental {
	
	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
       	 SingletonIncremental incremental = SingletonIncremental.getInstance();
       	 System.out.println(incremental);
       	 }
	}

}
