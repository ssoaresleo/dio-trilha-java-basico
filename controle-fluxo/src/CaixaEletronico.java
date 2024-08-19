public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30;
        double valorSaque = 12;

        if(valorSaque < saldo)
            saldo = saldo - valorSaque;

        System.out.println("Seu saldo agora é de " + saldo);
    }
}
