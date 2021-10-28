/*Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00*/
package first;
public class pessoaJuridica{

    String nome;
    int rendaAnual = 0;
    int numFun = 0;
    int imposto = 0;

    public pessoaJuridica(String nome, int rendaAnual, int numFun){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.numFun = numFun;
    }
    
    public static int calcularImposto(int rendaAnual, int numFun){
        int taxa = 0;

        if(numFun > 10){
            taxa = 14/100;
        }else{
            taxa = 16/100;
        }
        imposto = rendaAnual * taxa;
          
        return imposto;
    }

}