public class MinhaClasse {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);

        System.out.println("Fui executado pelo terminal!");
        System.out.println("Seu nome é " + nome);
        System.out.println("Seu sobrenome é " + sobrenome);
        System.out.println("Seu nome completo é " + nome + " " + sobrenome);
        System.out.println("Sua idade é " + idade + " anos");
    }
}
