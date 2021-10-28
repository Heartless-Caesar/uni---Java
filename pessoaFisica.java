package Taxes;

public class pessoaFisica {
	String nome;
    double rendaAnual;
    double gastosSaude;

    public pessoaFisica(String nome, double rendaAnual, double gastosSaude){
      this.nome = nome;
      this.rendaAnual = rendaAnual;
      this.gastosSaude = gastosSaude;
    }
   
    public double calcularImposto(double rendaAnual,double gastosSaude){
       double taxa;
       double imposto;
       
       if(rendaAnual <= 20000){
            taxa = 0.15;
       }else{
            taxa = 0.25;    
       }
       
       if(gastosSaude > 0){
    	   imposto = ((rendaAnual * taxa) - (gastosSaude * 0.5)); 
    	   return imposto;      
       }else{
    	   imposto = rendaAnual * taxa;
    	   return imposto;
       }
    }
}
