import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu primeiro nome:");
        String primeiroNome = scanner.next();

        System.out.println("Insira seu segundo nome:");
        String segundoNome = scanner.next();

        System.out.println("Qual sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println("Seu segundo nome é: " + segundoNome);
        System.out.println("Seu nome completo é: " + primeiroNome + " " + segundoNome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
    }
}