package main;
import main.produto_nac;

public class produto_imp extends produto_nac{
    
	double taxa_imp = 2.2/100;
	double taxa_alf = 3.5/100;
	String nome;
	double preco;
	
    public produto_imp(String nome, double preco) {
	 super(nome, preco);
	 this.preco = preco * taxa_alf * taxa_imp;
	}
    
    static void printInfoImp() {
    	System.out.println("O preco dos produtos foram multiplicados pelos valores de taxa de fabricação de 0.022 e 0.035");
    }
}
