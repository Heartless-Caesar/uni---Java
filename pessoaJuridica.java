package Taxes;

public class pessoaJuridica {
	String nome;
    double rendaAnual;
    int numFun = 0;

    public pessoaJuridica(String nome, double rendaAnual, int numFun){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.numFun = numFun;
    }
    
    public double calcularImposto(double rendaAnual, int numFun){
        double taxa = 0;
        double imposto = 0;

        if(numFun >= 10){
            taxa = 0.14;
        }else{
            taxa = 0.16;
        }
        imposto = rendaAnual * taxa;
          
        return imposto;
    }
}
