public class Main {
    public static void main(String[] args) {
        String s1 = "Leonardo"; // Poll de strings

        String s2 = "Julia"; // Poll de strings
        String s4 = "Julia"; // Poll de strings

        String s3 = new String("Julia");

        // comparação de strings
        // equals
        if(s2.equals(s3)) {
            System.out.println("È igual");
        } else {
            System.out.println("Diferentes");
        }

        String str = "a,b,c,d,e"; // imutaveis

        String [] alfabeto = str.split(",");

        System.out.println(alfabeto[0]);
        System.out.println(alfabeto[1]);
        System.out.println(alfabeto[2]);

        String palavras = "Curso java, Curso Spring boot";
        System.out.println(palavras);

        String palavrasMudadas = palavras.replaceAll("Curso", "Treinamento");
        System.out.println(palavrasMudadas);
    }
}