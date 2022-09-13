package Singleton;

public class GerenciadorImpresao {

	private static GerenciadorImpresao gerenciadorImpressao;
	
	private GerenciadorImpresao(){
		
	}
	
	public static GerenciadorImpresao getInstance() {
		if(gerenciadorImpressao == null) {
		gerenciadorImpressao = new GerenciadorImpresao();
		}
		return gerenciadorImpressao;
	}
	
}
