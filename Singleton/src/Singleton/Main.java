package Singleton;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorImpresao g1 = GerenciadorImpresao.getInstance();
		GerenciadorImpresao g2 = GerenciadorImpresao.getInstance();
		GerenciadorImpresao g3 = GerenciadorImpresao.getInstance();
		GerenciadorImpresao g4 = GerenciadorImpresao.getInstance();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		
		//Padrão Singleton dessa forma todos os objetos tem o mesmo endereço
		
	}

}
