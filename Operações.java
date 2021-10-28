package Taxes;

import java.util.Scanner;
import Taxes.pessoaFisica;
import Taxes.pessoaJuridica;

@SuppressWarnings("unused")
public class Operações {
   
	static void funcionalidades() {
		int op;
		double total = 0.0;
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
       
		do{
		System.out.println("Selecione a quantidade de contribuintes Fisicos");
		int qtdFis = scan.nextInt();
        
        if(qtdFis != 0){
             
             //PESSOA FISICA  
             int i = 0;
             pessoaFisica[] Physic = new pessoaFisica[qtdFis];  
            
             do {
            	//QUANTIDADE FISICA 
                System.out.println("Insira o nome");
                String nome = scan.next();
                System.out.println("Insira a renda anual(numero inteiro)");
                double rendaAnual = scan.nextDouble();
                System.out.println("Insira , se houver, os gastos medicos");
                double gastosSaude = scan.nextDouble();
                //scan.clase();
                Physic[i] = new pessoaFisica(nome,rendaAnual,gastosSaude);
                System.out.println("----------------------------------------------");
                double printValue = Physic[i].calcularImposto(rendaAnual,gastosSaude);
                System.out.println("Imposto " + printValue); 
                System.out.println("----------------------------------------------");
                total += Physic[i].calcularImposto(rendaAnual,gastosSaude);              
                i++;
             }while(i < qtdFis);  
                //TOTAL ACCUMULATED VALUE
           }
        else{
        	System.out.println("Quantidade nula");
           }
            
            
            //PESSOA JURIDICA
             System.out.println("Insira a quantidade de Consumidores Juridicos");
             int j = 0;
             int qtdJur = scan.nextInt();
             pessoaJuridica[] Organization = new pessoaJuridica[qtdJur];
             
             
             if(qtdJur > 0) {
       
             do{
            	//QUANTIDADE JURIDICA 
            	System.out.println("Pessoas Juridicas");
            	System.out.println("Insira o nome");
                String nome2 = scan.next();
                System.out.println("Insira a renda anual(numero inteiro)");
                int rendaAnual2 = scan.nextInt();
                System.out.println("Insira o numero de funcionarios(numero inteiro)");
                int numEmployees = scan.nextInt();
                Organization[j] = new pessoaJuridica(nome2,rendaAnual2,numEmployees);
                System.out.println("Imposto " + Organization[j].calcularImposto(rendaAnual2, numEmployees));
                total += Organization[j].calcularImposto(rendaAnual2,numEmployees);
                j++;
            }while(j < qtdJur);
           }  
            //TOTAL ACCUMULATED VALUE 
            System.out.println("Imposto acumulado " + total); 
            
            //REPEAT POSSIBLE OPERATIONS
            System.out.println("Deseja realizar outra operacao? (1) Sim (2)Não");
            op = scan.nextInt();
    }while(op == 1);
  }
}	
	
