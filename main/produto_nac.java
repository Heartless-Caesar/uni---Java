package main;

public class produto_nac {
   
	String nome;
	double preco;
	 
	public produto_nac(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void display(){  
	 System.out.print("Nome do produto = "+ nome + "  " + " Preco do produto = "+ preco);  
	 System.out.println();  
	}  
}
