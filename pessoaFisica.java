/*Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00*/
package first;
public class pessoaFisica {
    String nome;
    int rendaAnual;
    int gastosSaude;

    public pessoaFisica(String nome, int rendaAnual, int gastosSaude){
      this.nome = nome;
      this.rendaAnual = rendaAnual;
      this.gastosSaude = gastosSaude;
    }
   
    public static int calcularImposto(int rendaAnual,int gastosSaude){
       int taxa = 0;
       int imposto = 0;
       if(rendaAnual < 20000.00){
            taxa = 15/100;
       }else{
            taxa = 25/100;    
       }
       if(gastosSaude > 0){
         imposto = (rendaAnual * taxa) - (gastosSaude * 0.5); 
       }else{
           imposto = rendaAnual * taxa;
       }
     
     return imposto;
    }
}