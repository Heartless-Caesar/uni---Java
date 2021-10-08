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
    	String nome = scanNome.next();
    	double preco = scanNome.nextDouble();
    	array[i] = new produto_nac(nome,preco);
        i++;
    }while( i < num1);	
	
    //OUTPUT 1
    //LOOP PRINT
    do{
    	System.out.println("Item " + i);
    	System.out.println(array[i].nome);
    	System.out.println(array[i].preco);
    	System.out.println("-----------------------------------------");
    	i++;
    }while( i < num1);
    
    
    
	//PRODUTO IMPORTADO
    System.out.println("Insira a quantidade de produtos importados");
	Scanner input2 = new Scanner(System.in);
	int num2 = input1.nextInt();
	produto_imp[] array2 = new produto_imp[num2];	
	//INPUT LOOP
    do{
    	System.out.println("Insira o nome do produto e seu preco, respectivamente:");
    	Scanner scanNome = new Scanner(System.in);
    	String nome = scanNome.next();
    	double preco = scanNome.nextDouble();
    	array2[i] = new produto_imp(nome,preco);
        i++;
    }while( i < num2);
    
    do{
    	System.out.println("Item " + i);
    	System.out.println(array2[i].nome);
    	System.out.println(array2[i].preco);
    	System.out.println("-----------------------------------------");
    	i++;
    }while( i < num1);
	
	
	}
    
}
