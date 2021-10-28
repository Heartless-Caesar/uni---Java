/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00*/
package first;
import java.utils.Scanner;
import first.pessoaJuridica;
import first.pessoaFisica;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        pessoaFisica[] Physic = new pessoaFisica[];  
        pessoaJuridica[] Organization = new pessoaJuridica[];
        //PUT THE SELECT OPTION IN A WHILE LOOP SO THAT IT CAN BE REPEATED MULTIPLE TIMES   
        System.out.println('Selecione o tipo de contribuinte: (1)Fisico || (2)Juridico');
        int tipo = scan.nextInt();
        switch(tipo){
            case 1:
             System.out.println('Insira a quantidade de Consumidores Fisicos');
             int qtdFis = scan.nextInt();
             Physic[qtdFis]; 
             while(qtdFis > 0){
                System.out.println('Insira o nome');
                String nome = scan.next();
                System.out.println('Insira a renda anual(numero inteiro)');
                int rendaAnual = scan.nextInt();
                System.out.println('Insira , se houver, os gastos medicos');
                int gastosSaude = scan.nextInt();
                Physic[qtdFis] = Physic.calcularImposto(rendaAnual,gastosSaude); 
                qtdFis--;
             }
            break;
            case 2:
             System.out.println('Insira a quantidade de Consumidores Juridicos');
             int qtdJur = scan.nextInt();
             Organization[qtdJur]; 
             while(qtdJur > 0){
                System.out.println('Insira o nome');
                String nome = scan.next();
                System.out.println('Insira a renda anual(numero inteiro)');
                int rendaAnual = scan.nextInt();
                System.out.println('Insira o numero de funcionarios(numero inteiro)');
                int numEmployees = scan.nextInt();
                Organization[qtdJur].rendaAnual = rendaAnual;
                Organization[qtdJur] = Physic.calcularImposto(rendaAnual, numEmployees); 
                qtdJur--;
            }
            break;  
        }
}
