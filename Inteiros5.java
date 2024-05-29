package ExemploArrayList;

import java.util.ArrayList;

public class Inteiros5 {

	public static void main(String[] args) {

	ArrayList<Integer> numeros = new ArrayList<Integer>();	
	int soma = 0;
	
	numeros.add(9);
	numeros.add(7);
	numeros.add(14);
	numeros.add(33);
	numeros.add(11);
	for(int numero : numeros) {
		soma += numero;
	}
	System.out.println(soma);

}
}	
