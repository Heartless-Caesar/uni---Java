/*Fazer um programa para ler os dados de N produtos ( N fornecidos pelo usuário). Ao final, mostrar a
etiqueta de preço de cada produto na mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos importados possuem uma taxa de fabricação. Esses
dados, devem ser acrescentados na etiqueta de preço. Para produtos importados, a taxa e alfândega
devem ser acrescentados ao preço final do produto.  
 */
package main;
import main.produto_nac;
import java.util.Scanner;
import main.produto_imp;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	int i = 0;
	
	//PRODUTO NACIONAL
	System.out.println("Insira a quantidade de produtos nacionais:");
	Scanner input1 = new Scanner(System.in);
	int num1 = input1.nextInt();
	produto_nac[] array = new produto_nac[num1];
	//INPUT LOOP
    do{
    	System.out.println("Insira o nome do produto e seu preco, respectivamente:");
    	Scanner scanNome = new Scanner(System.in);
    	String nome1 = scanNome.next();
    	double preco1 = scanNome.nextDouble();
    	array[i] = new produto_nac(nome1,preco1);
        i++;
    }while( i < num1);	
	
    //OUTPUT 1
    //LOOP PRINT
    i = 0;
    do{
    	System.out.println("Item " + i);
    	array[i].display();
    	System.out.println("-----------------------------------------");
    	i++;
    }while( i < num1);
    
    
    /*
	//PRODUTO IMPORTADO
    System.out.println("Insira a quantidade de produtos importados");
	Scanner input2 = new Scanner(System.in);
	int num2 = input1.nextInt();
	int j = 0;
	produto_imp[] array2 = new produto_imp[num2];
	
	//INPUT LOOP
	while( j < num2){
    	System.out.println("Insira o nome do produto e seu preco, respectivamente:");
    	Scanner scanNome = new Scanner(System.in);
    	String nome2 = scanNome.next();
    	double preco2 = scanNome.nextDouble();
    	array2[j] = new produto_imp(nome2,preco2);
        j++;
    };
    j = 0;
    do {
    	System.out.println("Item " + j);
        array2[j].display();
    	System.out.println("-----------------------------------------");
    	j++;
    }while( j < num2);
	
	*/
	}
 
	static void print_prod_nac() {
		
	}
	
	static void print_prod_imp() {
		
	}
}
