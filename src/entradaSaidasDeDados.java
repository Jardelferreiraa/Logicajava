
import java.util.Scanner;
public class entradaSaidasDeDados {
    public static void main(String[] args) {
//        System.out.println("Olá! Eu faço impressão e pulo uma linha");
//        System.out.print("Olá! Eu faço impressão e não pulo linha");
//        System.out.printf("Olá! Eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado sim(true) ou não(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou o(a) " + nome + " , tenho " + idade + " e estou empregado? "+ empregado);
    }
}
