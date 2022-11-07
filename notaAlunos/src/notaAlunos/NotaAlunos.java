package notaAlunos;

import java.util.Locale;
import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
       
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: ");
		Double nota1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		Double nota2 = sc.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		System.out.println("A média alcançada é: " + media);
		
		if(media < 7.0) {
			System.out.println("O aluno está de recuperação!");
		}
		else {
			System.out.println("O aluno está aprovado!");
		}
	}
}
