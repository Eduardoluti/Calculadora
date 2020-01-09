import java.util.Scanner;

/*
 * Testa se um número é par ou ímpar
 */
public class Cap3_Lab2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número:");
		int numero = scan.nextInt();
		
		String paridade = (numero % 2 == 0) ? "par" : "ímpar";
		
		System.out.printf("O número %d é %s", numero, paridade);
		
	}

}
