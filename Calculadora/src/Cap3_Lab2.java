import java.util.Scanner;

/*
 * Testa se um n�mero � par ou �mpar
 */
public class Cap3_Lab2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero:");
		int numero = scan.nextInt();
		
		String paridade = (numero % 2 == 0) ? "par" : "�mpar";
		
		System.out.printf("O n�mero %d � %s", numero, paridade);
		
	}

}
