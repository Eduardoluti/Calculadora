import java.util.Scanner;

/*
 * Soma dois numeros inteiros
 */
public class Cap3_Lab1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int valor2 = scan.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.printf("%d + %d = %d",valor1,valor2,resultado);
	}

}
