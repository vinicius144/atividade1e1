package Exercicio3;

public class FabricaDeCarro {
	
	
	public static FabricaDeCarro instancia;

	private FabricaDeCarro() {
	}
	public static synchronized FabricaDeCarro getInstance(){
		if(instancia==null){
			instancia = new FabricaDeCarro();
		}
		
		return instancia;
	}
	


}
	

