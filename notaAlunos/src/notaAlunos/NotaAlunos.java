package notaAlunos;

import java.util.Locale;
import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
       
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1� nota: ");
		Double nota1 = sc.nextDouble();
		System.out.println("Digite a 2� nota: ");
		Double nota2 = sc.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		System.out.println("A m�dia alcan�ada �: " + media);
		
		if(media < 7.0) {
			System.out.println("O aluno est� de recupera��o!");
		}
		else {
			System.out.println("O aluno est� aprovado!");
		}
	}
}
